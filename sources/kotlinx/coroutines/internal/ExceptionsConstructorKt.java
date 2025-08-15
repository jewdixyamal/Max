package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007j\u0002`\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\"\u0010\u0013\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*(\b\u0002\u0010\u0019\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0007¨\u0006\u001a"}, d2 = {"", "E", "exception", "tryCopyException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/Class;", "clz", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "createConstructor", "(Ljava/lang/Class;)Lm56;", "block", "safeCtor", "(Lm56;)Lm56;", "", "defaultValue", "fieldsCountOrDefault", "(Ljava/lang/Class;I)I", "accumulator", "fieldsCount", "throwableFields", "I", "Lkotlinx/coroutines/internal/CtorCache;", "ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class ExceptionsConstructorKt {
    private static final CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(Throwable.class, -1);

    static {
        CtorCache ctorCache2;
        try {
            ctorCache2 = FastServiceLoaderKt.getANDROID_DETECTED() ? WeakMapCtorCache.INSTANCE : ClassValueCtorCache.INSTANCE;
        } catch (Throwable unused) {
            ctorCache2 = WeakMapCtorCache.INSTANCE;
        }
        ctorCache = ctorCache2;
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> m56 createConstructor(Class<E> cls) {
        Object obj;
        m56 m56;
        kpa kpa;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE;
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            Constructor constructor = constructors[i];
            Class[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                Class<Throwable> cls2 = Throwable.class;
                Class<String> cls3 = String.class;
                if (length2 != 1) {
                    kpa = length2 != 2 ? new kpa((Object) null, -1) : (!tpa.f(parameterTypes[0], cls3) || !tpa.f(parameterTypes[1], cls2)) ? new kpa((Object) null, -1) : new kpa(safeCtor(new r45(constructor, 0)), 3);
                } else {
                    Class cls4 = parameterTypes[0];
                    kpa = tpa.f(cls4, cls3) ? new kpa(safeCtor(new r45(constructor, 1)), 2) : tpa.f(cls4, cls2) ? new kpa(safeCtor(new r45(constructor, 2)), 1) : new kpa((Object) null, -1);
                }
            } else {
                kpa = new kpa(safeCtor(new r45(constructor, 3)), 0);
            }
            arrayList.add(kpa);
            i++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((kpa) obj).b).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((kpa) next).b).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        kpa kpa2 = (kpa) obj;
        return (kpa2 == null || (m56 = (m56) kpa2.a) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : m56;
    }

    /* access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$1(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(new Object[]{th.getMessage(), th});
    }

    /* access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$3(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance(new Object[]{th.getMessage()});
        th2.initCause(th);
        return th2;
    }

    /* access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$4(Constructor constructor, Throwable th) {
        return (Throwable) constructor.newInstance(new Object[]{th});
    }

    /* access modifiers changed from: private */
    public static final Throwable createConstructor$lambda$7$lambda$6(Constructor constructor, Throwable th) {
        Throwable th2 = (Throwable) constructor.newInstance((Object[]) null);
        th2.initCause(th);
        return th2;
    }

    private static final int fieldsCount(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            Class<? super Object> cls2 = cls;
            for (int i3 = 0; i3 < length; i3++) {
                if (!Modifier.isStatic(declaredFields[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    public static /* synthetic */ int fieldsCount$default(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCountOrDefault(Class<?> cls, int i) {
        Object obj;
        nec.a(cls);
        try {
            obj = Integer.valueOf(fieldsCount$default(cls, 0, 1, (Object) null));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object valueOf = Integer.valueOf(i);
        if (obj instanceof njc) {
            obj = valueOf;
        }
        return ((Number) obj).intValue();
    }

    private static final m56 safeCtor(m56 m56) {
        return new a42(2, m56);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [njc] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Throwable safeCtor$lambda$9(defpackage.m56 r3, java.lang.Throwable r4) {
        /*
            r0 = 0
            java.lang.Object r3 = r3.invoke(r4)     // Catch:{ all -> 0x0025 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.getMessage()     // Catch:{ all -> 0x0025 }
            boolean r1 = defpackage.tpa.f(r1, r2)     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r3.getMessage()     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0025 }
            boolean r4 = defpackage.tpa.f(r1, r4)     // Catch:{ all -> 0x0025 }
            if (r4 != 0) goto L_0x002c
            r3 = r0
            goto L_0x002c
        L_0x0025:
            r3 = move-exception
            njc r4 = new njc
            r4.<init>(r3)
            r3 = r4
        L_0x002c:
            boolean r4 = r3 instanceof defpackage.njc
            if (r4 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ExceptionsConstructorKt.safeCtor$lambda$9(m56, java.lang.Throwable):java.lang.Throwable");
    }

    public static final <E extends Throwable> E tryCopyException(E e) {
        E e2;
        if (!(e instanceof fx3)) {
            return (Throwable) ctorCache.get(e.getClass()).invoke(e);
        }
        try {
            e2 = ((fx3) e).a();
        } catch (Throwable th) {
            e2 = new njc(th);
        }
        if (e2 instanceof njc) {
            e2 = null;
        }
        return (Throwable) e2;
    }
}
