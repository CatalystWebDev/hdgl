package hdgl.db.task;

import java.util.concurrent.Future;

/**
 * �첽���ʽӿڣ����ڷ�װ�첽ִ�н������Ҫע����ǻ�ȡ�˽ӿ�֮�������δ��ʼ��
 * ��Ҫ����run��sync����֮��ŻῪʼ����
 * 
 * @author elm
 *
 * @param <T> ����ķ�������
 */
public interface AsyncResult<T> extends Future<T> {
	
	/**
	 * ��ʼִ�д��첽����
	 */
	public void start();	
	
	/**
	 * ���ظ������Ƿ�֧��Cancel����	 
	 */
	public boolean supportCancel();	
	
	/**
	 * ��ǰ������ӻص��ӿ�
	 * @param callback �ص������ӿ�
	 */
	public void addCallback(AsyncCallback<T> callback);
	
	/**
	 * �Ƴ�ĳһ���ص��ӿ�
	 * @param callback �ص������ӿ�
	 */
	public void removeCallback(AsyncCallback<T> callback);
	
}
