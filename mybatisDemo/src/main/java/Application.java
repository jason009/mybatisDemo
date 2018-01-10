import com.jason.mybatis.Blog;
import com.jason.mybatis.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * <b><code>Application</code></b>
 * <p>
 * class_comment
 * <p>
 * <b>Creation Time:</b> 2018/1/10 15:19.
 *
 * @author yangjiangshui
 * @version ${Revision} 2018/1/10
 * @since mybatis project_version
 */
public class Application{
        public static void main(String[] args) throws Exception {
            //SpringApplication.run(Application.class, args);
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            Blog blog = null;
            try {
                //blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", '1');
                BlogMapper blogMapper = session.getMapper(BlogMapper.class);
                blog =  blogMapper.selectBlog("1");
            } finally {
                session.close();
            }
            System.out.println(blog.toString());
        }
}
