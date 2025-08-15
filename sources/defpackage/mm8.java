package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;

/* renamed from: mm8  reason: default package */
public final class mm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mm8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((mm8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        mm8 mm8 = new mm8(continuation, this.Y);
        mm8.X = obj;
        return mm8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = MediaTypePickerWidget.Y;
        MediaTypePickerWidget mediaTypePickerWidget = this.Y;
        mediaTypePickerWidget.getClass();
        bc7 bc7 = MediaTypePickerWidget.Y[2];
        ((km8) this.X).getClass();
        ((tl8) mediaTypePickerWidget.o.getValue()).setSelected(gm8.a);
        return e5f.a;
    }
}
