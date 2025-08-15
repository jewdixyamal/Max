package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.mediapicker.MediaPickerScreen;

/* renamed from: pe8  reason: default package */
public final class pe8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaPickerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe8(Continuation continuation, MediaPickerScreen mediaPickerScreen) {
        super(2, continuation);
        this.Y = mediaPickerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pe8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pe8 pe8 = new pe8(continuation, this.Y);
        pe8.X = obj;
        return pe8;
    }

    public final Object o(Object obj) {
        float f;
        od2.a0(obj);
        i3d i3d = (i3d) this.X;
        boolean z = i3d instanceof h3d;
        MediaPickerScreen mediaPickerScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = MediaPickerScreen.B0;
            mediaPickerScreen.o0().setDropdownRotationProgress(0.0f);
            bc7[] bc7Arr2 = MediaPickerScreen.B0;
            bc7 bc7 = bc7Arr2[4];
            mediaPickerScreen.v0.b(mediaPickerScreen, 0);
            bc7 bc72 = bc7Arr2[3];
            ((w12) mediaPickerScreen.u0.getValue()).setVisibility(8);
            bc7 bc73 = bc7Arr2[7];
            ((View) mediaPickerScreen.y0.getValue()).setVisibility(8);
        } else if (i3d instanceof f3d) {
            bc7[] bc7Arr3 = MediaPickerScreen.B0;
            mediaPickerScreen.getClass();
            bc7[] bc7Arr4 = MediaPickerScreen.B0;
            bc7 bc74 = bc7Arr4[4];
            fs fsVar = mediaPickerScreen.v0;
            if (((Number) fsVar.a(mediaPickerScreen)).intValue() > 0) {
                bc7 bc75 = bc7Arr4[4];
                f = ((float) ((f3d) i3d).a) / ((float) ((Number) fsVar.a(mediaPickerScreen)).intValue());
            } else {
                f = 180.0f;
            }
            mediaPickerScreen.o0().setDropdownRotationProgress(f);
        }
        return e5f.a;
    }
}
