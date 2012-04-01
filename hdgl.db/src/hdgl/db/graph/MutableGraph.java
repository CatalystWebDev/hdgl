package hdgl.db.graph;

import hdgl.db.task.AsyncResult;

/**
 * ��һ��ͼ���޸ķ��ʽӿ�
 * @author elm
 *
 */
public interface MutableGraph {
	
	/**
	 * ���ύ�޸�ʱ�����ͻ������Դ����޸Ĳ�����������һ��
	 */
	public static final int IGNORE_ON_CONFLICT = 0;
	
	/**
	 * ���ύ�޸�ʱ���������ͻ����ع����е��޸Ĳ�ʹ�����޸�ʧ��
	 */
	public static final int FAIL_ON_CONFLICT = 1;
	
	/**
	 * �ύ�޸ģ����ص��첽�����ִ�й����У�ϵͳ���ڷ�һ��״̬��
	 * ���첽�����ɺ�ϵͳ�ָ�һ��״̬���첽���ʹ�ò���ֵ����˴��ύ�Ƿ�ɹ���
	 * ���ʹ����IGNORE_ON_CONFLICT��Ϊ�쳣���ԣ��򷵻�ֵ�ض�Ϊtrue��
	 * ��ʹ���е��޸Ĳ�����ʧ�ܶ��������ˡ�
	 * 
	 * @param conflictPolicy ���ύ�޸ķ�����ͻʱ�Ĵ������
	 * @return �ύ�������첽���
	 */
	public AsyncResult<Boolean> commit(int conflictPolicy);
	
	/**
	 * ʹ��FAIL_ON_CONFLICT��Ϊ�����ύ�޸ġ�
	 * @see MutableGraph.commit(int conflictPolicy)
	 * @return �ύ�������첽���
	 */
	public AsyncResult<Boolean> commit();
}
