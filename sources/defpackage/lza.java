package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: lza  reason: default package */
public final class lza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lza) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lza lza = new lza(this.Y, continuation);
        lza.X = obj;
        return lza;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        String str = (String) this.X;
        PickerMembersListWidget pickerMembersListWidget = this.Y;
        if (str == null || w9e.C0(str)) {
            bc7[] bc7Arr = PickerMembersListWidget.x0;
            hdc adapter = pickerMembersListWidget.p0().getAdapter();
            nxa nxa = pickerMembersListWidget.Y;
            if (!tpa.f(adapter, nxa)) {
                dle dle = pickerMembersListWidget.u0;
                if (dle != null) {
                    dle.B(pickerMembersListWidget.p0());
                }
                pickerMembersListWidget.p0().M0(nxa, false);
                pickerMembersListWidget.u0 = z7.m(pickerMembersListWidget.p0());
                if (pickerMembersListWidget.n0()) {
                    EndlessRecyclerView2 p0 = pickerMembersListWidget.p0();
                    bo6 bo6 = pickerMembersListWidget.v0;
                    if (bo6 != null) {
                        p0.p0(bo6);
                    }
                    pickerMembersListWidget.v0 = null;
                    h8e h8e = pickerMembersListWidget.w0;
                    if (h8e != null) {
                        p0.p0(h8e);
                    }
                    pickerMembersListWidget.w0 = null;
                    pickerMembersListWidget.m0(pickerMembersListWidget.p0());
                }
            }
        } else {
            bc7[] bc7Arr2 = PickerMembersListWidget.x0;
            hdc adapter2 = pickerMembersListWidget.p0().getAdapter();
            nxa nxa2 = pickerMembersListWidget.Z;
            if (!tpa.f(adapter2, nxa2)) {
                dle dle2 = pickerMembersListWidget.u0;
                if (dle2 != null) {
                    dle2.B(pickerMembersListWidget.p0());
                }
                pickerMembersListWidget.p0().M0(nxa2, false);
                pickerMembersListWidget.u0 = z7.m(pickerMembersListWidget.p0());
                if (pickerMembersListWidget.n0()) {
                    EndlessRecyclerView2 p02 = pickerMembersListWidget.p0();
                    bo6 bo62 = pickerMembersListWidget.v0;
                    if (bo62 != null) {
                        p02.p0(bo62);
                    }
                    pickerMembersListWidget.v0 = null;
                    h8e h8e2 = pickerMembersListWidget.w0;
                    if (h8e2 != null) {
                        p02.p0(h8e2);
                    }
                    pickerMembersListWidget.w0 = null;
                }
            }
        }
        return e5f.a;
    }
}
