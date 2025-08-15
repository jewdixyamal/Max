package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.messages.location.ActLocationMap;

/* renamed from: nm8  reason: default package */
public final class nm8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaTypePickerWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nm8(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.Y = mediaTypePickerWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nm8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nm8 nm8 = new nm8(continuation, this.Y);
        nm8.X = obj;
        return nm8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean f = tpa.f(wm9, ul8.b);
        MediaTypePickerWidget mediaTypePickerWidget = this.Y;
        if (f) {
            bc7[] bc7Arr = MediaTypePickerWidget.Y;
            Context context = mediaTypePickerWidget.getContext();
            bc7 bc7 = MediaTypePickerWidget.Y[0];
            long longValue = ((Number) mediaTypePickerWidget.a.a(mediaTypePickerWidget)).longValue();
            int i = ActLocationMap.U0;
            Intent intent = new Intent(context, ActLocationMap.class);
            intent.putExtra("ru.ok.tamtam.extra.CHAT_ID", longValue);
            intent.putExtra("map:DISABLE_LIVE", false);
            intent.putExtra("map:REGULAR_SENDING", true);
            mediaTypePickerWidget.startActivityForResult(intent, 371);
        } else if (tpa.f(wm9, vl8.b)) {
            bc7[] bc7Arr2 = MediaTypePickerWidget.Y;
            mediaTypePickerWidget.getClass();
            bc7[] bc7Arr3 = BottomSheetWidget.x0;
            znc znc = null;
            lg3 e = wg0.e(u8a.H, 6, (Bundle) null);
            e.a(new mg3(1, new eqe(u8a.G), 3, false));
            e.a(new mg3(2, new eqe(u8a.F), 3, false));
            e.a(new mg3(3, new eqe(u8a.E), 1, false));
            ConfirmationBottomSheet e2 = e.e();
            e2.setTargetController(mediaTypePickerWidget);
            uu3 uu3 = mediaTypePickerWidget;
            while (uu3.getParentController() != null) {
                uu3 = uu3.getParentController();
            }
            foc foc = uu3 instanceof foc ? (foc) uu3 : null;
            if (foc != null) {
                znc = foc.T();
            }
            e2.z0(mediaTypePickerWidget);
            if (znc != null) {
                coc coc = new coc(e2, (String) null, (zu3) null, (zu3) null, false, -1);
                wg0.l(false, coc, true, "BottomSheetWidget");
                znc.G(coc);
            }
        } else if (wm9 instanceof c64) {
            vo2.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
