package com.kepler.generic.wrap;

import com.kepler.generic.GenericImported;
import com.kepler.service.Service;

/**
 * 泛型调用代理
 * 
 * @author KimShen
 *
 */
public interface GenericService extends GenericImported {

	/**
	 * 代理泛型
	 * 
	 * @param service 泛型服务
	 * @param method 指定方法
	 * @param args 参数代理集合(GenericArg或内置类型)
	 * @return 执行结果
	 * @throws Throwable
	 */
	public Object invoke(Service service, String method, Object... args) throws Throwable;
}
