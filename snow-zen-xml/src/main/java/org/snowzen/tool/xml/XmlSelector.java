package org.snowzen.tool.xml;

/**
 * 节点选择器
 *
 * @author sobre
 */
public interface XmlSelector {

    /**
     * 根据表达式匹配到对应的节点
     *
     * @param expr 匹配表达式
     * @return 匹配到的节点
     */
    XmlNode select(String expr);
}
