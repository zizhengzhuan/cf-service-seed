package com.zzht.service.demo.common;

import com.ecity.datasource.ConnectionProperty;
import com.ecity.datasource.IWorkspace;
import com.ecity.datasource.WorkspaceFactory;
import com.ecity.exception.EcityException;
import com.ecity.se.core.ConfigGroup;
import com.ecity.se.core.IService;
import com.ecity.se.core.Logger;
import com.ecity.se.core.Server;

import java.io.File;
import java.util.Collection;

import javax.servlet.ServletContext;


/**
 * @Description: java类作用描述
 * @Author: kunhour
 * @CreateDate: 2018/4/17 8:55
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
public class ServiceCore implements IService {

    private ConfigGroup mainGroup = null;
    private Server SEServer;
    public String loginUrl = "";
    public ConnectionProperty conn = null;
    ServletContext context = null;
    public Logger logger = null;

    public Server getServer() {
        return this.SEServer;
    }

    /**
     * 服务初始化
     */
    @Override
    public void setServer(Server seServer) {
        this.SEServer = seServer;
        this.logger = this.getServer().getLogger();
        this.mainGroup = SEServer.getConfig().getAt("PROJECT-CONFIG");
        ConfigGroup mapConfig = SEServer.getConfig().getAt("MAPSERVICE-CONFIG");



        String basePath = this.SEServer.getHome();
        basePath = basePath.substring(0, basePath.length() - 1);
        basePath = basePath.substring(0, basePath.lastIndexOf(File.separator));


        //1.加载服务引用的jar文件，一般当前服务对应的jar文件放在services目录下的一个自定义文件夹中
//        loadOwnerJar();



    }

    public ServiceCore() {

    }

    /**
     * 读取workspace的数据库配置
     */
    private void loadWorkspaceConf() {
    }

    private void loadOwnerJar() {
        String servicePath = SEServer.getServicePath();
        String personalJarPath = servicePath + "/projectLib/";
        //修改成引用jar中的任意存在的一个类路径
        String typicalClass = "com.zzht.component.demo.api.PersonServiceImpl";
        SEServer.loadCustomLibs(typicalClass, personalJarPath);
    }

    /**
     * 获取workspace
     * @return
     * @throws EcityException
     */
    public IWorkspace getWorkspace() throws EcityException {
        return WorkspaceFactory.getWorkspace(conn);
    }

    /**
     * 加载服务引用的jar文件，一般当前服务对应的jar文件放在services目录下的一个自定义文件夹中
     */


    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }

    @Override
    public Collection<ConfigGroup> getConfigGroup() {
        return null;
    }

    @Override
    public String getServiceName() {
        return "XXXServer(服务描述)";
    }
    @Override
    public String getServiceDescription() {
        if ((this.mainGroup == null) || (this.mainGroup.getAt("Name") == null)) {
            return "XXXServer(服务描述)";
        }
        return this.mainGroup.getAt("Name").description;
    }
    @Override
    public String getServiceBrief() {
        if ((this.mainGroup == null) || (this.mainGroup.getAt("Name") == null)) {
            return "XXXServer";
        }
        return this.mainGroup.getAt("Name").value;
    }
    @Override
    public void clear() {

    }



}
