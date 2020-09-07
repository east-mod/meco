# meco

#### 介绍
实现**Menk国际编码、Menk形码、Delehi国际编码、Oyun国际编码、Z编码**之间相互转换.
Oyun国际编码和Z编码暂不支持

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
delehi

#### 参与贡献
