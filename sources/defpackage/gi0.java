package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.Continuation;

/* renamed from: gi0  reason: default package */
public abstract class gi0 implements Continuation, ux3, Serializable {
    public final Continuation a;

    public gi0(Continuation continuation) {
        this.a = continuation;
    }

    public ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        u44 u44 = (u44) getClass().getAnnotation(u44.class);
        String str2 = null;
        if (u44 == null) {
            return null;
        }
        int v = u44.v();
        if (v <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = u44.l()[i];
            }
            bkb bkb = br7.o;
            bkb bkb2 = br7.c;
            if (bkb == null) {
                try {
                    bkb bkb3 = new bkb(Class.class.getDeclaredMethod("getModule", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
                    br7.o = bkb3;
                    bkb = bkb3;
                } catch (Exception unused2) {
                    br7.o = bkb2;
                    bkb = bkb2;
                }
            }
            if (bkb != bkb2) {
                Method method = (Method) bkb.a;
                Object invoke = method != null ? method.invoke(getClass(), (Object[]) null) : null;
                if (invoke != null) {
                    Method method2 = (Method) bkb.b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, (Object[]) null) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) bkb.c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, (Object[]) null) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = u44.c();
            } else {
                str = str2 + '/' + u44.c();
            }
            return new StackTraceElement(str, u44.m(), u44.f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public Continuation n(Object obj, Continuation continuation) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object o(Object obj);

    public void p() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: gi0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: kotlin.coroutines.Continuation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: gi0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void resumeWith(java.lang.Object r3) {
        /*
            r2 = this;
        L_0x0000:
            gi0 r2 = (defpackage.gi0) r2
            kotlin.coroutines.Continuation r0 = r2.a
            java.lang.Object r3 = r2.o(r3)     // Catch:{ all -> 0x000d }
            tx3 r1 = defpackage.tx3.a     // Catch:{ all -> 0x000d }
            if (r3 != r1) goto L_0x0014
            return
        L_0x000d:
            r3 = move-exception
            njc r1 = new njc
            r1.<init>(r3)
            r3 = r1
        L_0x0014:
            r2.p()
            boolean r2 = r0 instanceof defpackage.gi0
            if (r2 == 0) goto L_0x001d
            r2 = r0
            goto L_0x0000
        L_0x001d:
            r0.resumeWith(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi0.resumeWith(java.lang.Object):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
