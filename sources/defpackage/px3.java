package defpackage;

import java.util.concurrent.CancellationException;
import java.util.function.BinaryOperator;

/* renamed from: px3  reason: default package */
public final /* synthetic */ class px3 implements BinaryOperator {
    public final Object apply(Object obj, Object obj2) {
        x77 x77 = (x77) obj;
        x77 x772 = (x77) obj2;
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        return x772;
    }
}
