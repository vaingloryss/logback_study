import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 最简单的日志使用
 */
public class TestLogback01 {
    private static Logger logger;
    @BeforeClass
    public static void testInit(){
        /*
            传入当前类，该类中的日志打印时会打印出该类的类名信息
         */
        logger = LoggerFactory.getLogger(TestLogback01.class);
        /**
         * 当没有配置 logback 的日志策略时，logback使用默认的策略：
         * 将会在 root logger 中新增一个ConsoleAppender，将日志信息打印到控制台。
         * 我们可以通过 Logback 内部的状态系统来报告它本身的状态信息，发生在 logback 生命周期中的事件可以通过StatusManager来获取。
         */

        /*LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);*/

        /**
         * Logback 没有扫描到 logback-test.xml、logback.groovy 和 logback.xml 这三个配置文件，所以通过默认的配置策略：
         * 添加一个基本的 ConsoleAppender来进行配置，将日志信息打印到控制台。Appender 类被看作为输出的目的地。
         * Appenders 包括 console，files，Syslog，TCP Sockets，JMS 等等其它的日志输出目的地。
         * 用户可以根据自己的情况轻松的创建自己的 Appender。
         * 如果发生了错误，logback 会自动在控制台打印自己内部的状态信息。
         */

    }
    @Test
    public void test01(){
        logger.info("提示信息");
        logger.warn("警告信息");
        logger.error("异常信息");
        logger.debug("调试信息");
    }
}
