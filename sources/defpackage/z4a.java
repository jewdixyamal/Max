package defpackage;

import android.content.res.Configuration;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: z4a  reason: default package */
public final class z4a extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z4a(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((z4a) n((du4) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z4a z4a = new z4a(this.Y, continuation);
        z4a.X = obj;
        return z4a;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int ordinal = ((du4) this.X).ordinal();
        hm9.m("OneMeDynamicFont", "change dynamic font to " + ordinal, new Object[0]);
        OneMeApplication oneMeApplication = this.Y;
        Configuration configuration = new Configuration(oneMeApplication.getResources().getConfiguration());
        int floatToRawIntBits = Float.floatToRawIntBits(configuration.fontScale);
        n4c.a.getClass();
        configuration.fontScale = Float.intBitsToFloat(floatToRawIntBits + (n4c.b.b() ? -1 : 1));
        oneMeApplication.getResources().updateConfiguration(configuration, oneMeApplication.getResources().getDisplayMetrics());
        oneMeApplication.onConfigurationChanged(configuration);
        return e5f.a;
    }
}
