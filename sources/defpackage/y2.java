package defpackage;

import android.util.AttributeSet;
import android.widget.EditText;
import one.me.chats.picker.AbstractPickerScreen;

/* renamed from: y2  reason: default package */
public final /* synthetic */ class y2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractPickerScreen b;

    public /* synthetic */ y2(AbstractPickerScreen abstractPickerScreen, int i) {
        this.a = i;
        this.b = abstractPickerScreen;
    }

    public final Object invoke() {
        jqe jqe;
        AbstractPickerScreen abstractPickerScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = AbstractPickerScreen.s0;
                return abstractPickerScreen.p0(abstractPickerScreen.getContext());
            default:
                bc7[] bc7Arr2 = AbstractPickerScreen.s0;
                CharSequence charSequence = null;
                g9a g9a = new g9a(abstractPickerScreen.getContext(), (AttributeSet) null);
                EditText editText = g9a.getEditText();
                j0e s0 = abstractPickerScreen.s0();
                if (!(s0 == null || (jqe = (jqe) ((q0e) s0).getValue()) == null)) {
                    charSequence = jqe.b(g9a.getContext());
                }
                editText.setHint(charSequence);
                g9a.setCallback(new ph4((Object) abstractPickerScreen, (Object) g9a));
                g9a.getEditText().addTextChangedListener(new z2(0, abstractPickerScreen));
                return g9a;
        }
    }
}
