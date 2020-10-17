package org.snowzen.tool.xml;

/**
 * xml节点
 *
 * @author sobre
 */
public interface XmlNode {

    /* 属性解析 */

    /**
     * 获取节点属性
     *
     * @param attrName 属性名不能为空
     * @return 节点属性值
     */
    String attr(String attrName);

    /**
     * 设置节点属性值
     *
     * @param attrName 属性名
     * @param attrVal  属性值
     */
    void attr(String attrName, String attrVal);

    /* 值获取 */

    /**
     * 获取节点内容
     *
     * @return 节点内容
     */
    String text();

    /**
     * 设置节点内容
     *
     * @param content 节点内容
     */
    void text(String content);

    /* 标签操作 */

    /**
     * 在当前节点内头部添加子节点
     *
     * @param node 要添加的子节点
     */
    void append(XmlNode node);

    /**
     * 在当前节点内尾部添加子节点
     *
     * @param node 要添加的子节点
     */
    void prepend(XmlNode node);

    /**
     * 在当前节点前添加同级节点
     *
     * @param node 要添加的节点
     */
    void after(XmlNode node);

    /**
     * 在当前节点后添加同级节点
     *
     * @param node 要添加的节点
     */
    void before(XmlNode node);

    /**
     * 删除当前节点
     */
    void remove();

    /**
     * 删除当前节点下匹配的子节点
     *
     * @param expr 匹配表达式
     */
    void remove(String expr);

    /**
     * 删除当前节点的所有子元素
     */
    void empty();

    /* 祖先元素操作 */

    /**
     * 返回当前节点的直接父节点
     *
     * @return 直接父节点
     */
    XmlNode parent();

    /**
     * 返回当前节点的所有父节点，直到root节点
     *
     * @return 所有父节点
     */
    XmlNode parents();

    /**
     * 返回当前节点根据表达式匹配到的父节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的父节点
     */
    XmlNode parents(String expr);

    /**
     * 返回当前节点到匹配的父节点之间的所有节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的节点，不包括当前节点和匹配到的父节点
     */
    XmlNode parentsUntil(String expr);

    /* 子元素操作 */

    /**
     * 返回当前节点下一级所有子节点
     *
     * @return 下一级所有子节点
     */
    XmlNode children();

    /**
     * 返回当前节点下所有匹配的子节点以及子节点下的匹配节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的节点
     */
    XmlNode find(String expr);

    /* 同胞元素操作 */

    /**
     * 返回当前节点的所有同胞节点
     *
     * @return 所有同胞节点
     */
    XmlNode siblings();

    /**
     * 返回当前节点的所有匹配的同胞节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的同胞节点
     */
    XmlNode siblings(String expr);

    /**
     * 返回当前节点后一个节点
     *
     * @return 当前节点后一个节点
     */
    XmlNode next();

    /**
     * 返回当前节点后的所有同胞节点
     *
     * @return 匹配到的同胞节点
     */
    XmlNode nextAll();

    /**
     * 返回当前节点到匹配的同胞节点之间的所有同胞节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的同胞节点，不包括当前节点和匹配到的节点
     */
    XmlNode nextUntil(String expr);

    /**
     * 返回当前节点的前一个节点
     *
     * @return 当前节点前一个节点
     */
    XmlNode prev();

    /**
     * 返回当前节点前面所有节点
     *
     * @return 当前节点前面所有节点
     */
    XmlNode prevAll();

    /**
     * 返回当前节点到匹配节点之间的所有节点
     *
     * @param expr 匹配表达式
     * @return 匹配到节点，不包括当前节点和匹配到的节点
     */
    XmlNode prevUntil(String expr);

    /**
     * 当前节点如果是一个节点集合，则返回第一个节点
     *
     * @return 节点集合内第一个节点
     */
    XmlNode first();

    /**
     * 当前节点如果是一个节点集合，则返回最后一个节点
     *
     * @return 节点集合内最后一个节点
     */
    XmlNode last();

    /**
     * 当前节点如果是一个节点集合，则返回指定索引位置节点
     *
     * @param index 索引位置，从0开始
     * @return 指定位置节点
     */
    XmlNode eq(int index);

    /**
     * 当前节点如果是一个节点集合，则返回匹配到的节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的节点
     */
    XmlNode filter(String expr);

    /**
     * 当前节点如果是一个节点集合，则返回未匹配到的节点
     *
     * @return 为匹配到的节点
     */
    XmlNode not();
}
