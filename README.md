# 《重构改善既有代码的设计》第一章影片租赁示例

《重构改善既有代码的设计》这本书我读了好几遍，每次读都要重写第一章的示例很浪费时间，这次就把写好的例子上传一下下次就可以直接开始了。

影片租赁的业务需求

1.有三种影片分别为儿童、普通、新影片。

2.儿童影片的起租是1.5元，超过3天的部分每天1.5元  举个例子  租赁4天《喜洋洋与灰太狼之虎虎生威》的价格是 1.5 + （4-3）* 1.5 也就是3元。普通影片起租是2元，超过2天的部分每天1.5元，计算方式同上。新影片没有起租费用，按照每天3元计算。

3.积分计算 儿童影片和普通影片租赁一次一个积分，新影片租赁一次两个积分。

4.结算界面 打印用户租赁记录 包含影片、价格、积分、结算金额。
