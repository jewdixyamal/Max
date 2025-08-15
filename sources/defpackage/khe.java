package defpackage;

import java.io.Serializable;

/* renamed from: khe  reason: default package */
public final class khe implements je7, Serializable {
    public k56 a;
    public volatile Object b = qq9.v0;
    public final Object c = this;

    public khe(k56 k56) {
        this.a = k56;
    }

    public final boolean a() {
        return this.b != qq9.v0;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        qq9 qq9 = qq9.v0;
        if (obj2 != qq9) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.b;
            if (obj == qq9) {
                obj = this.a.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
