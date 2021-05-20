# meco

#### 介绍
实现**Menk国际编码(标准编码输入法)、Menk形码(蒙科立输入法 2008)、Delehi国际编码(德力海蒙古文输入法2016)、Oyun国际编码、Z编码**之间相互转换.

暂不支持**基于“蒙古语言文字数字资源建设与共享工程”项目标准的输入法**

#### CURL例子
curl --location --request GET '39.104.94.197:2207/meco/translate' \
--header 'Content-Type: application/json' \
--data-raw '{
    "from":"menk_shape",
    "to":"delehi",
    "content":"           "
}'

#### from，to可选类型
menk_shape,
menk_letter,
delehi,
zcode

#### 参与贡献
zvvnmod team,zcode team

相关问题提问或讨论:http://zvvnmod.com
