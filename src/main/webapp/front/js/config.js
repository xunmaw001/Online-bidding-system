
var projectName = '网上招投标系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '专家',
	url: './pages/zhuanjia/list.html'
}, 
{
	name: '招标项目',
	url: './pages/zhaobiaoxiangmu/list.html'
}, 
{
	name: '标书信息',
	url: './pages/biaoshuxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssm1dl59/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"招标者","menuJump":"列表","tableName":"zhaobiaozhe"}],"menu":"招标者管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"专家","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除"],"menu":"项目分类","menuJump":"列表","tableName":"xiangmufenlei"}],"menu":"项目分类管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["查看","删除","审核"],"menu":"招标项目","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除"],"menu":"项目投标","menuJump":"列表","tableName":"xiangmutoubiao"}],"menu":"项目投标管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"标书信息","menuJump":"列表","tableName":"biaoshuxinxi"}],"menu":"标书信息管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"专家列表","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","项目投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"标书信息列表","menuJump":"列表","tableName":"biaoshuxinxi"}],"menu":"标书信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除","支付"],"menu":"项目投标","menuJump":"列表","tableName":"xiangmutoubiao"}],"menu":"项目投标管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"专家列表","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","项目投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"标书信息列表","menuJump":"列表","tableName":"biaoshuxinxi"}],"menu":"标书信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"招标项目","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","删除","审核"],"menu":"项目投标","menuJump":"列表","tableName":"xiangmutoubiao"}],"menu":"项目投标管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"专家列表","menuJump":"列表","tableName":"zhuanjia"}],"menu":"专家模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","项目投标"],"menu":"招标项目列表","menuJump":"列表","tableName":"zhaobiaoxiangmu"}],"menu":"招标项目模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"标书信息列表","menuJump":"列表","tableName":"biaoshuxinxi"}],"menu":"标书信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"招标者","tableName":"zhaobiaozhe"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
