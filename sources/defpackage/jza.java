package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: jza  reason: default package */
public final class jza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jza(Continuation continuation, PickerMembersListWidget pickerMembersListWidget, View view) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jza) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jza jza = new jza(continuation, this.Y, this.Z);
        jza.X = obj;
        return jza;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        pickerMembersListWidget.Z.E(list);
        View view = this.Z;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        qm0 qm0 = pickerMembersListWidget.s0;
        if (viewGroup != null) {
            ay7.b(viewGroup, (View) qm0.getValue(), -1);
        }
        EndlessRecyclerView2 p0 = pickerMembersListWidget.p0();
        int i = 0;
        p0.setVisibility((list == null || (list.isEmpty() ^ true)) ? 0 : 4);
        aba aba = (aba) qm0.getValue();
        if (list == null || !list.isEmpty()) {
            i = 4;
        }
        aba.setVisibility(i);
        return e5f.a;
    }
}
