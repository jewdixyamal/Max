package defpackage;

import java.lang.reflect.Constructor;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;

/* renamed from: r45  reason: default package */
public final /* synthetic */ class r45 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Constructor b;

    public /* synthetic */ r45(Constructor constructor, int i) {
        this.a = i;
        this.b = constructor;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        Constructor constructor = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$1(constructor, th);
            case 1:
                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$3(constructor, th);
            case 2:
                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$4(constructor, th);
            default:
                return ExceptionsConstructorKt.createConstructor$lambda$7$lambda$6(constructor, th);
        }
    }
}
