package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.chats.forward.ForwardPickerScreen;

/* renamed from: oz5  reason: default package */
public final /* synthetic */ class oz5 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ oz5(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bc7[] bc7Arr = ForwardPickerScreen.I0;
                forwardPickerScreen.C0(booleanValue);
                return e5f;
            case 1:
                View view = (View) obj;
                bc7[] bc7Arr2 = ForwardPickerScreen.I0;
                i3a onBackPressedDispatcher = forwardPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f;
            default:
                bc7[] bc7Arr3 = ForwardPickerScreen.I0;
                dy7.c(1).Y((View) obj).I(forwardPickerScreen.B0() ? Collections.singletonList(new tt3(m8a.e, (jqe) new eqe(o8a.b), Integer.valueOf(woc.s1), (Integer) null, 20)) : Collections.singletonList(new tt3(m8a.f, (jqe) new eqe(o8a.c), Integer.valueOf(woc.r1), (Integer) null, 20))).s().build().q(forwardPickerScreen);
                return e5f;
        }
    }
}
