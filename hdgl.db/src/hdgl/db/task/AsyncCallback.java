package hdgl.db.task;

/**
 * AsyncResult�Ļص�����
 * <p>����Ļص�����������ʵ�ֵģ����Һ������嶼Ϊ�ա�
 * ʵ�ִ���ʱֻҪѡ���Եĸ��ǲ��ֻص��������ɡ�<p>
 * @author elm
 *
 */
public abstract class AsyncCallback<T> {
	
	/**
	 * ������ʼʱ����
	 */
	public void started(){
		
	}
	
	/**
	 * ������ɹ���ɣ�����ȡ������ֵʱ����
	 * @param value ����ֵ
	 */
	public void completed(T value){
		
	}
	
	/**
	 * ��������ȸ���ʱ������progress��һ��0-1�����ִ����ŵ�ǰ����Ľ���
	 * @param progress 0-1�����֣������ŵ�ǰ����Ľ���
	 */
	public void progress(double progress){
		
	}
	
	/**
	 * ������ִ�й������׳��쳣��ֹͣʱ������
	 * @param ex �׳����쳣
	 */
	public void exception(Throwable ex){
		
	}
	
	/**
	 * ������ȡ��ʱ������	 
	 */
	public void cancelled(){
		
	}
}
