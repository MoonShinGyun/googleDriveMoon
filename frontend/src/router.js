
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"

import IndexManager from "./components/listers/IndexCards"
import IndexDetail from "./components/listers/IndexDetail"


import FilestatusManager from "./components/listers/FilestatusCards"
import FilestatusDetail from "./components/listers/FilestatusDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },

            {
                path: '/indices',
                name: 'IndexManager',
                component: IndexManager
            },
            {
                path: '/indices/:id',
                name: 'IndexDetail',
                component: IndexDetail
            },


            {
                path: '/filestatuses',
                name: 'FilestatusManager',
                component: FilestatusManager
            },
            {
                path: '/filestatuses/:id',
                name: 'FilestatusDetail',
                component: FilestatusDetail
            },



    ]
})
