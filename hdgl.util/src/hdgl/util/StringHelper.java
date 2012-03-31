package hdgl.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ַ����ĸ�������
 * @author elm
 *
 */
public class StringHelper {
    
    
    /**
     * ����ʵ����������
     */
    private StringHelper(){
        
    }
    
    /**
     * <p>���ַ�������Ϊ�ļ�·����<p>
     * <p>�������£�</p>
     * <ul>
     *  <li>�����ַ�����ԭ�������a-z, A-Z, 0-9, _(�»���), -(����)</li>
     *  <li>�����ָ����ַ�: / | \ ���ᱻת��Ϊƽ̨��·���ָ�����Windows����'\\', Unix����'/'</li>
     *  <li>�����ַ��ᱻת��Ϊ"$xxxx"������xxxx�Ǹ��ַ���ʮ������Unicodeֵ</li>
     * </ul>
     * @param name
     * @return
     */
    public static String filenameEncode(String name){
        StringBuilder fn=new StringBuilder();
        for(int i=0;i<name.length();i++){
            char c=name.charAt(i);
            if((c>'a'&&c<'z')||(c>'A'&&c<'Z')||(c>'0'&&c<'9')||c=='_'||c=='-'){
                fn.append(c);
            }else if(c=='/'||c=='\\'||c=='|'){
                if(fn.length()>0){
                    fn.append(".d");
                }
                fn.append(File.separatorChar);
            }else{
                int num=(int)c;
                fn.append('$');
                fn.append(String.format("%4x", num));
            }
        }
        fn.append(".k");
        return fn.toString();
    }
    
    public static String formatTimestamp(long timestamp){
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return format.format(new Date(timestamp));
    }
    
}
