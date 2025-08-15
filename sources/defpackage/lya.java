package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: lya  reason: default package */
public final class lya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lya) n((String) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lya lya = new lya(continuation, this.Y);
        lya.X = obj;
        return lya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        hdc hdc = (hdc) pickerChatsListWidget.w0.C().get(0);
        boolean C0 = w9e.C0((String) this.X);
        nxa nxa = pickerChatsListWidget.y0;
        nxa nxa2 = pickerChatsListWidget.x0;
        nd3 nd3 = pickerChatsListWidget.w0;
        if (C0) {
            if (!tpa.f(hdc, nxa2)) {
                dle dle = pickerChatsListWidget.s0;
                if (dle != null) {
                    dle.B(pickerChatsListWidget.p0());
                }
                nd3.E(nxa);
                nd3.o.a(0, nxa2);
                pickerChatsListWidget.p0().setRefreshingNext(PickerChatsListWidget.n0(pickerChatsListWidget));
                pickerChatsListWidget.s0 = z7.m(pickerChatsListWidget.p0());
            }
        } else if (!tpa.f(hdc, nxa)) {
            dle dle2 = pickerChatsListWidget.s0;
            if (dle2 != null) {
                dle2.B(pickerChatsListWidget.p0());
            }
            nd3.E(nxa2);
            nd3.o.a(0, nxa);
            pickerChatsListWidget.p0().setRefreshingNext(PickerChatsListWidget.n0(pickerChatsListWidget));
            pickerChatsListWidget.s0 = z7.m(pickerChatsListWidget.p0());
        }
        return e5f.a;
    }
}
