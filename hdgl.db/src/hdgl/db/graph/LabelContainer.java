package hdgl.db.graph;

import hdgl.db.task.AsyncResult;

/**
 * ӵ�б�ǩ��ʵ�壨����ͱߣ��Ĺ��ýӿ�
 * @author elm
 *
 */
public abstract class LabelContainer {

	/**
	 * ��ȡ��ǩ���µ�ʱ���
	 * @param name ��ǩ��
	 * @return ��ǩ���µ�ʱ���
	 */
	public abstract long getTimestamp(String name);
	
	/**
	 * ��ȡ��ǩ���µ�ֵ�������ǩ�����ڣ�����null��
	 * @param name ��ǩ��
	 * @return ��ǩ��ֵ
	 */
	public abstract Object getLabel(String name);
	
	/**
	 * ǿ���͵Ļ�ȡ��ǩֵ���µķ����������ǩ�����ڻ������Ͳ�ƥ�䣬���᷵��null
	 * @param name ��ǩ��
	 * @param type Ҫ��ȡ����������
	 * @return type���͵ı�ǩ��ֵ
	 */
	public <T> T getLabel(String name, Class<T> type){
		try{
			return type.cast(getLabel(name));
		}catch (ClassCastException e) {
			return null;
		}
	}
	
	/**
	 * ��ȡ��ǩ����ʷ����ʱ�����˳��Ϊ���򣨴����µ���ɣ���������ǰ���µ�ʱ�����
	 * <b>��ȡ��ʷʱ������ܻ����������ʹ���첽�ӿڵ���</b>
	 * <p>�˷����п��ܲ���֧�֣���ʱ���׳�UnsupportedOperationException��
	 * Ҫ���Դ˷����Ƿ�֧�֣���ʹ��Graph.supportHistory()</p>
	 * @param name ��ǩ��
	 * @return ��ʷʱ����б���첽���
	 * @throws UnsupportedOperationException �����ͼ��֧�ּ�����ʷֵ
	 */
	public abstract AsyncResult<Iterable<Long>> getHistoricalTimestamps(String name) throws UnsupportedOperationException;
	
	/**
	 * ��ȡ��ֹ��timestampʱ�̵����µ�ֵ����ֵ��ʱ���С�ڵ���timestamp��ֵ�ļ�����ʱ�������ֵ��
	 * �����ֵ��timestampʱ��֮ǰ�������ڣ��򷵻�null
	 * <b>��ȡ��ʷ��ֵ���ܻ����������ʹ���첽�ӿڵ���</b>
	 * <p>�˷����п��ܲ���֧�֣���ʱ���׳�UnsupportedOperationException��
	 * Ҫ���Դ˷����Ƿ�֧�֣���ʹ��Graph.supportHistory()</p>
	 * 
	 * @param name Ҫ��ȡ��ֵ
	 * @param timestamp ��ֹ��ʱ���
	 * @return ���ؽ�ֹ��timestampʱ�̵����µ�ֵ���첽�ӿ� 
	 * @throws UnsupportedOperationException �����ͼ��֧�ּ�����ʷֵ
	 */
	public abstract AsyncResult<Object> getHistoricalLabel(String name,long timestamp) throws UnsupportedOperationException;
	
	/**
	 * getHistoricalLabel(String name,long timestamp)��ǿ���Ͱ汾
	 * ��ȡ��ֹ��timestampʱ�̵����µ�ֵ����ֵ��ʱ���С�ڵ���timestamp��ֵ�ļ�����ʱ�������ֵ��
	 * �����ֵ��timestampʱ��֮ǰ�������ڣ����߲�����type���ͣ��򷵻�null
	 * <b>��ȡ��ʷ��ֵ���ܻ����������ʹ���첽�ӿڵ���</b>
	 * <p>�˷����п��ܲ���֧�֣���ʱ���׳�UnsupportedOperationException��
	 * Ҫ���Դ˷����Ƿ�֧�֣���ʹ��Graph.supportHistory()</p>
	 * 
	 * @see getHistoricalLabel(String name,long timestamp)
	 * @param name Ҫ��ȡ��ֵ
	 * @param timestamp ��ֹ��ʱ���
	 * @param type Ҫ��ȡ��ֵ������
	 * @return ���ؽ�ֹ��timestampʱ�̵����µ�ֵ���첽�ӿ�
	 * @throws UnsupportedOperationException �����ͼ��֧�ּ�����ʷֵ
	 *
	 */
	public abstract <T> AsyncResult<T> getHistoricalLabel(String name,long timestamp,Class<T> type) throws UnsupportedOperationException;
	
}
