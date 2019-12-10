#!/bin/sh -l
pipeline {
    //在可用的节点运行
    agent any
    // 时间戳以及超时时间10分钟
    options {
        timestamps()
        timeout(10000)
    }

    environment {
        // 公司 wsl 密钥
        WSL_CREDENTIALSID = 'cd5c8204-2bd5-4183-8168-ba587243c9ff'

        sixi_customer_center_wechat = 'https://git.i.sixi.com/sixi-base-service/sixi-customer-center-wechat.git'
        //  # 项目文件压缩包名 默认 dist.tar.gz
        RESOURCE_NAME = 'dist.tar.gz'
    }

    stages {
        stage ('prepare') {
            steps {
                //清空发布目录
                // sh 'rm -rf /var/lib/jenkins/workspace/test-pipeline/*'
                echo '清空发布目录'
            }
        }
        //拉取git代码仓库
        stage ('Checkout') {
            steps {
                checkout(
                        [
                            $class: 'GitSCM', 
                            branches: [[name: '*/dev']], 
                            doGenerateSubmoduleConfigurations: false, 
                            extensions: [], 
                            submoduleCfg: [], 
                            userRemoteConfigs: [[credentialsId: WSL_CREDENTIALSID,url:sixi_customer_center_wechat]]
                        ]
                    )
            }
        }
        // 构建
        stage ('Build') {
            steps {
                nodejs('NodeJS 8.11.0'){
                    sh 'pwd'
                    sh 'npm -v'
                    sh 'node -v'

                    sh 'npm install'
                    sh 'npm run build'
                }
            }
        }
        stage ('Pack') {
            steps {
                sh 'pwd'
                sh 'ls -a ./dist'
                sh 'cd ./dist'
                sh 'tar -zcf $resourceName *'
                
            }
        }
    }
}