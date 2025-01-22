import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import biaoshuxinxi from '@/views/modules/biaoshuxinxi/list'
    import xiangmufenlei from '@/views/modules/xiangmufenlei/list'
    import xiangmutoubiao from '@/views/modules/xiangmutoubiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhuanjia from '@/views/modules/zhuanjia/list'
    import zhaobiaoxiangmu from '@/views/modules/zhaobiaoxiangmu/list'
    import zhaobiaozhe from '@/views/modules/zhaobiaozhe/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/biaoshuxinxi',
        name: '标书信息',
        component: biaoshuxinxi
      }
      ,{
	path: '/xiangmufenlei',
        name: '项目分类',
        component: xiangmufenlei
      }
      ,{
	path: '/xiangmutoubiao',
        name: '项目投标',
        component: xiangmutoubiao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/zhuanjia',
        name: '专家',
        component: zhuanjia
      }
      ,{
	path: '/zhaobiaoxiangmu',
        name: '招标项目',
        component: zhaobiaoxiangmu
      }
      ,{
	path: '/zhaobiaozhe',
        name: '招标者',
        component: zhaobiaozhe
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
