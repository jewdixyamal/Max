package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: wya  reason: default package */
public final class wya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wya(Continuation continuation, PickerContactsListWidget pickerContactsListWidget, View view) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wya) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wya wya = new wya(continuation, this.Y, this.Z);
        wya.X = obj;
        return wya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        pickerContactsListWidget.Y.E(list);
        boolean z = !w9e.C0((CharSequence) pickerContactsListWidget.n0().u0.a.getValue());
        qm0 qm0 = pickerContactsListWidget.t0;
        int i = 0;
        if (z) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                ay7.b(viewGroup, (View) qm0.getValue(), -1);
            }
            pickerContactsListWidget.o0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            aba aba = (aba) qm0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            aba.setVisibility(i);
        } else {
            pickerContactsListWidget.o0().setVisibility(0);
            ((aba) qm0.getValue()).setVisibility(4);
        }
        return e5f.a;
    }
}
