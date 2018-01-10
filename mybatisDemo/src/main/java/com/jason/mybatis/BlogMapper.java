package com.jason.mybatis;

/**
 * <b><code>BlogMapper</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/8 18:28.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/8
 * @since spring-boot project_version
 */
public interface BlogMapper {
    Blog selectBlog(String id);
}
