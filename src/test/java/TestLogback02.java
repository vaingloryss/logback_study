import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 参数化日志
 */
public class TestLogback02 {

    private static Logger logger;

    @BeforeClass
    public static void testInit(){
        logger = LoggerFactory.getLogger(TestLogback02.class);
    }

    /**
     * 使用 + 方式构建参数化日志
     */
    @Test
    public void test01(){
        String info = "hello,logback";
        logger.info("info:"+info);
    }

    /**
     * 判断是否开启debug模式，如果没有开启，可以节省参数构建带来的损耗
     */
    @Test
    public void test02(){
        Integer num = 100;
        if (logger.isDebugEnabled()){
            logger.debug("数量:{}",num);
        }
    }

    /**
     * 参数化日志最好的方式
     */
    @Test
    public void test03(){
        String name = "李白";
        logger.debug("name = {}",name);
    }
}
