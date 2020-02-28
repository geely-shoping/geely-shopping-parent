create table customer_account_tb
(
    customer_id int auto_increment primary key comment '用户编号',
    username varchar(20) comment '账号',
    password varchar(20) comment '密码',
    customer_stats varchar(20) comment '用户状态',
    modified_time datetime comment '最后修改时间'
) comment '用户账号表';

create table customer_info_tb
(
    customer_info_id int primary key auto_increment comment '个人信息编号',
    customer_name varchar(20) comment '用户真实姓名',
    customer_gender char(2) comment '用户性别',
    identity_card_type varchar(20) comment '证件类型',
    identity_card_no varchar(20) comment '证件号码',
    custoemr_phone char(11) comment '手机号',
    customer_email varchar(30) comment '邮箱',
    balance decimal(10,2) comment '余额',
    nickname varchar(20) comment '昵称',
    icon varchar(200) comment '头像',
    modified_time datetime comment '最后修改时间'
)comment '个人信息表';

create table shipping_addr_tb
(
    customer_addr_id int primary key  auto_increment comment '收货地址id',
    zip int comment '邮箱',
    province varchar(20) comment '省份',
    city varchar(20) comment '城市',
    district varchar(20) comment '地区',
    address varchar(200) comment '具体的地址门牌号',
    is_default varchar(20) comment '是否默认',
    modified_time datetime comment '最后修改时间'
) comment '收货地址表';

create table integral_tb
(
    customer_integral_id int primary key auto_increment comment '用户积分编号',
    user_point int comment '用户积分',
    register_time datetime comment '用户注册时间',
    birthday datetime comment '会员生日',
    modified_time datetime comment '最后修改时间'
) comment '积分表';

create table  grade_tb
(
    customer_grade_id int primary key auto_increment comment '会员等级编号',
    grade_name varchar(20) comment '会员等级名称',
    max_point int comment '最大积分',
    min_point int comment '最小积分',
    modified_time datetime comment '最后修改时间'
) comment '用户等级表';

create table coupon_tb
(
    coupon_id int primary key auto_increment comment '优惠券编号',
    coupon_title varchar(20) comment '优惠券标题',
    coupon_img varchar(200) comment '优惠券图片',
    coupon_used varchar(20) comment '优惠券用于(生鲜,水果)',
    coupon_type varchar(20) comment '优惠券类型(满减，无门槛)',
    coupon_money decimal(10,2) comment '优惠价钱',
    coupon_validity varchar(100) comment '有效时间(2020-3-3~',
    coupon_state varchar(20) comment '状态(未使用,已使用,已失效)',
    used_time datetime comment '使用时间',
    modified_time datetime comment '最后修改时间'
) comment '优惠券表';

create table shopping_cart_tb
(
    shopping_cart_id int primary key auto_increment comment '购物车编号',
    product_id int comment '商品编号',
    product_amount int comment '商品数量',
    product_price decimal(10,2) comment '商品价钱',
    add_time datetime comment '加入购物车时间',
    modified_time datetime comment '最后修改时间'
) comment '购物车表';

create table comment_tb
(
    comment_id int primary key auto_increment comment '评论表编号',
    comment_content varchar(200) comment '评论内容',
    comment_product int comment '商品编号',
    modified_time datetime comment '最后修改时间'
) comment '评论表';

create table collect_tb
(
    collect_id int primary key auto_increment comment '收藏表编号',
    collect_product int comment '商品编号',
    modified_time datetime comment '最后修改时间'
) comment '收藏表';

create table my_footprint_tb
(
    footprint_id int primary key auto_increment comment '足迹编号',
    product_id int comment '商品编号',
    browse_time datetime comment '浏览时间'
) comment '我的足迹表';

create table order_master_tb
(
    order_id int primary key auto_increment comment '订单编号',
    order_uuid varchar(200) comment '订单uuid',
    payment_method varchar(20) comment '支付方式',
    order_money decimal(10,2) comment '订单金额',
    district_money decimal(10,2) comment '优惠金额',
    payment_money decimal(10,2) comment '支付金额',
    overbooking_time datetime comment '下单时间',
    payment_time datetime comment '支付时间',
    shipments_time datetime comment '发货时间',
    receiving_time datetime comment '收货时间',
    order_state varchar(20) comment '订单状态',
    order_point int comment '订单积分',
    modified_time datetime comment '最后修改时间'
) comment '订单主表';

create table order_detail_tb
(
    order_detail_id int primary key  auto_increment comment '订单详情编号',
    product_id int comment '商品编号',
    product_name varchar(50) comment '商品名称',
    product_amount int comment '商品数量',
    product_money decimal(10,2) comment '商品单价',
    apportion_money decimal(10,2) comment '优惠分摊金额',
    modified_time datetime comment '最后修改时间'
) comment '订单详情表';

create table balance_change_tb
(
    balance_change_id int primary key auto_increment comment '余额变动编号',
    source varchar(50) comment '记录来源',
    source_detail int comment '相关单据id',
    create_time datetime comment '记录生成时间',
    amount decimal(10,2) comment '变动金额'
) comment '余额变动表';

create table account_info_tb
(
    account_info_id int primary key auto_increment comment '账号个人信息表编号',
    account_id int comment '账号编号',
    info_id int comment '个人信息编号'
) comment '账号个人信息关联表';

create table customer_addr_tb
(
    customer_addr_id int auto_increment primary key comment '用户收货地址关联表编号',
    customer_id int comment '用户编号',
    addr_id int comment '收货地址编号'
) comment '用户收货地址关联表';

create table customer_integral_tb
(
    customer_addr_id int auto_increment primary key comment '用户积分关联表编号',
    customer_id int comment '用户编号',
    integral_id int comment '积分编号'
) comment '用户积分关联表';

create table customer_grade_tb
(
    customer_grade_id int auto_increment primary key comment '用户等级关联表编号',
    customer_id int comment '用户编号',
    grade_id int comment '等级编号'
) comment '用户等级关联表';

create table customer_coupon_tb
(
    customer_coupon_id int primary key auto_increment comment '用户优惠券关联表编号',
    customer_id int comment '用户编号',
    coupon_id int comment '优惠券编号'
) comment '用户优惠券关联表';

create table customer_shopping_cart_tb
(
    customer_shopping_cart_id int auto_increment primary key comment '用户购物车关联表编号',
    customer_id int comment '用户编号',
    shopping_cart_id int comment '购物车编号'
) comment '用户购物车关联表';

create table customer_comment_tb
(
    customer_comment_id int auto_increment primary key comment '用户评论关联表编号',
    customer_id int comment '用户编号',
    comment_id int comment '评论编号'
) comment '用户评论关联表';

create table customer_collect_tb
(
    customer_collect_id int primary key  auto_increment comment '用户收藏关联表编号',
    customer_id int comment '用户编号',
    collect_id int comment '收藏编号'
) comment '用户收藏关联表';

create table customer_footpring_tb
(
    customer_footprint_id int primary key auto_increment comment '用户足迹关联表编号',
    customer_id int comment '用户编号',
    footpring_id int comment '足迹编号'
) comment '用户足迹关联表';

create table order_master_detail_tb
(
    order_master_detail_id int auto_increment primary key comment '订单主从关联表编号',
    order_master_id int comment '订单主表编号',
    order_detail_id int comment '订单从表编号'
) comment '订单主从关联表';

create table customer_order_tb
(
    customer_order_id int primary key auto_increment comment '用户订单关联表编号',
    cusotemr_id int comment '用户编号',
    order_master_id int comment '订单编号'
) comment '用户订单关联表';

create table customer_balance_change_tb
(
    customer_balance_change_id int auto_increment primary key comment '用户余额变动关联表编号',
    customer_id int comment '用户编号',
    balance_change_id int comment '余额变动编号'
) comment '用户余额变动关联表';


/*商家模块数据表*/

create table product_tb
(
    product_id int auto_increment primary key comment '商品ID',
    product_name varchar(50) comment '商品名称',
    product_price decimal comment '商品价格',
    product_image varchar(200) comment '商品主图',
    product_describe varchar(200) comment '商品描述',
    product_status char(2) comment '商品状态（是，否）',
    product_create datetime comment '商品创建时间',
    product_last datetime comment '最后修改时间'
)comment '商品信息表';

create table product_category_tb
(
    category_id int auto_increment primary key comment '分类ID',
    category_name varchar(10) comment '分类名称',
    category_parent int comment '父分类ID',
    category_status varchar(4) comment '分类状态(禁用，启用)',
    category_describe varchar(200) comment '分类描述',
    category_last datetime comment '最后修改时间'
)comment '商品分类表';

create table product_image_tb
(
    image_id int auto_increment primary key comment '图片ID',
    image_name varchar(200) comment '图片地址',
    image_master varchar(2) comment '是否主图（是，否）',
    image_status varchar(4) comment '是否有效（有效，无效）',
    image_describe varchar(200) comment '图片描述',
    image_last datetime comment '最后修改时间'
)comment '商品图片表';

create table product_model_tb
(
    model_id int auto_increment primary key comment '型号Id',
    model_name varchar(20) comment '型号名字',
    model_price decimal comment '价钱',
    model_describe varchar(200) comment '型号描述',
    model_last datetime comment '最后修改时间'
)comment '商品型号表';

create table product_color_tb
(
    color_id int auto_increment primary key comment '颜色ID',
    color_name varchar(20) comment '颜色名字',
    color_image varchar(200) comment '颜色图片',
    color_last datetime comment '最后修改时间'
)comment '商品颜色表';

create table product_details_tb
(
    details_id int auto_increment primary key comment '商品详情ID',
    details_name varchar(500) comment '详情描述',
    details_image_one varchar(200) comment '第一张图片',
    details_image_two varchar(200) comment '第二张图片',
    details_image_three varchar(200) comment '第三张图片',
    details_image_four varchar(200) comment '第四张图片',
    details_image_five varchar(200) comment '第五张图片',
    details_last datetime comment '最后修改时间'
)comment '商品详情表';

create table employee_tb
(
    employee_id int auto_increment primary key comment '员工ID',
    employee_name varchar(20) comment '员工名字',
    employee_sex char(2) comment '性别',
    employee_phone char(11) comment '电话号码',
    employee_card char(18) comment '身份证',
    employee_school varchar(30) comment '毕业学校',
    employee_entry datetime comment '入职时间',
    employee_last datetime comment '最后修改时间'
)comment '员工信息表';

create table employee_account_tb
(
    account_id int auto_increment primary key comment '账号ID',
    account_name varchar(30) comment '帐户名',
    account_password varchar(30) comment '密码',
    account_create datetime comment '创建时间',
    account_last datetime comment '最后修改时间'
)comment '员工账号表';

create table dept_tb
(
    dept_id int auto_increment primary key comment '部门ID',
    dept_name varchar(20) comment '部门名',
    dept_describe varchar(100) comment '部门描述',
    dept_create datetime comment '创建时间',
    dept_last datetime comment '最后修改时间'
)comment '部门信息表';

create table account_dept_tb
(
    account_dept_id int auto_increment primary key comment '部门账号关联表编号',
    account_id int  comment '账号ID',
    dept_id int   comment '部门ID'
)comment '部门账号关联表';

create table menu_tb
(
    menu_id int auto_increment primary key comment '菜单ID',
    menu_name varchar(20) comment '菜单名',
    menu_parent char(2) comment '是否父菜单',
    menu_pid int comment '父菜单ID',
    menu_url varchar(200) comment '菜单地址'
)comment '菜单表';

create table menu_dept_tb
(
    menu_dept_id int auto_increment primary key comment '菜单部门关联表编号',
    menu_id int comment '菜单ID',
    dept_id int comment '部门ID'
)comment '菜单部门关联表';

create table product_category_relation_tb
(
    pro_category_id int auto_increment primary key comment '关联表ID',
    product_id int comment '商品ID',
    category_id int comment '分类ID'
)comment '商品分类关联表';

create table product_image_relation_tb
(
    pro_image_id int auto_increment primary key comment '关联表ID',
    product_id int comment '商品ID',
    image_id int comment '图片ID'
)comment '商品图片关联表';

create table prodcut_model_relation_tb
(
    pro_color_id int auto_increment primary key comment '关联表ID',
    product_id int comment '商品ID',
    color_id int comment '颜色ID'
)comment '商品颜色关联表';

create table product_details_relation_tb
(
    pro_details_id int auto_increment primary key comment '关联表ID',
    product_id int comment '商品ID',
    details_id int comment '详情ID'
)comment '商品详情关联表';

create table employee_account_relation_tb
(
    emp_account_id int auto_increment primary key comment '关联表ID',
    employee_id int comment '员工ID',
    account_id int comment '账号ID'
)comment '员工账号信息关联表';