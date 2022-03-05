import  asciiPanel.AsciiPanel;
import asciiPanel.AsciiFont;
import  asciiPanel.AsciiCharacterData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config8x8.xml");
        AsciiPanel panel=(AsciiPanel) context.getBean("panel");
        System.out.println(panel.getAsciiFont().getFontFilename());

        context=new ClassPathXmlApplicationContext("config12x12.xml");
        panel=(AsciiPanel) context.getBean("panel");
        System.out.println(panel.getAsciiFont().getFontFilename());
    }
}
