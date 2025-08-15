package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: jya  reason: default package */
public final class jya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget, View view) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jya) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jya jya = new jya(continuation, this.Y, this.Z);
        jya.X = obj;
        return jya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        pickerChatsListWidget.y0.E(list);
        int i = 0;
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.p0().setRefreshingNext(false);
        }
        if (tpa.f(pickerChatsListWidget.b, "all.chat.folder")) {
            View view = this.Z;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            qm0 qm0 = pickerChatsListWidget.z0;
            if (viewGroup != null) {
                ay7.b(viewGroup, (View) qm0.getValue(), -1);
            }
            pickerChatsListWidget.p0().setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
            aba aba = (aba) qm0.getValue();
            if (list == null || !list.isEmpty()) {
                i = 4;
            }
            aba.setVisibility(i);
        }
        return e5f.a;
    }
}
