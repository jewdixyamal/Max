package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: zya  reason: default package */
public final class zya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerContactsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zya(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerContactsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zya) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zya zya = new zya(this.Y, continuation);
        zya.X = obj;
        return zya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean C0 = w9e.C0((String) this.X);
        PickerContactsListWidget pickerContactsListWidget = this.Y;
        if (C0) {
            bc7[] bc7Arr = PickerContactsListWidget.y0;
            hdc adapter = pickerContactsListWidget.o0().getAdapter();
            nd3 nd3 = pickerContactsListWidget.s0;
            if (!tpa.f(adapter, nd3)) {
                dle dle = pickerContactsListWidget.v0;
                if (dle != null) {
                    dle.B(pickerContactsListWidget.o0());
                }
                pickerContactsListWidget.o0().setAdapter(nd3);
                pickerContactsListWidget.v0 = z7.m(pickerContactsListWidget.o0());
                RecyclerView o0 = pickerContactsListWidget.o0();
                bo6 bo6 = pickerContactsListWidget.w0;
                if (bo6 != null) {
                    o0.p0(bo6);
                }
                pickerContactsListWidget.w0 = null;
                h8e h8e = pickerContactsListWidget.x0;
                if (h8e != null) {
                    o0.p0(h8e);
                }
                pickerContactsListWidget.x0 = null;
                pickerContactsListWidget.m0(pickerContactsListWidget.o0());
            }
        } else {
            bc7[] bc7Arr2 = PickerContactsListWidget.y0;
            hdc adapter2 = pickerContactsListWidget.o0().getAdapter();
            nxa nxa = pickerContactsListWidget.Y;
            if (!tpa.f(adapter2, nxa)) {
                dle dle2 = pickerContactsListWidget.v0;
                if (dle2 != null) {
                    dle2.B(pickerContactsListWidget.o0());
                }
                pickerContactsListWidget.o0().setAdapter(nxa);
                pickerContactsListWidget.v0 = z7.m(pickerContactsListWidget.o0());
                RecyclerView o02 = pickerContactsListWidget.o0();
                bo6 bo62 = pickerContactsListWidget.w0;
                if (bo62 != null) {
                    o02.p0(bo62);
                }
                pickerContactsListWidget.w0 = null;
                h8e h8e2 = pickerContactsListWidget.x0;
                if (h8e2 != null) {
                    o02.p0(h8e2);
                }
                pickerContactsListWidget.x0 = null;
            }
        }
        return e5f.a;
    }
}
