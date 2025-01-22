const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1dl59/",
            name: "ssm1dl59",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1dl59/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上招投标系统"
        } 
    }
}
export default base
