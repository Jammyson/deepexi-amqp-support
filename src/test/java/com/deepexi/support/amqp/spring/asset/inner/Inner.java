package com.deepexi.support.amqp.spring.asset.inner;

import com.deepexi.support.amqp.EventMessage;

/**
 * @author taccisum - liaojinfeng@deepexi.com
 * @since 2019-11-25
 */
public class Inner {
    @EventMessage(exchange = "ex", code = "inner_foo")
    public static class Foo {
    }
}
