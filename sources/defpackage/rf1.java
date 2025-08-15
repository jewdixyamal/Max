package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: rf1  reason: default package */
public final /* synthetic */ class rf1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf1(s3e s3e, m6e m6e) {
        this.a = 4;
        this.c = s3e;
        this.b = m6e;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m56 m56;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = CallOpponentsListWidget.H0;
                if (view instanceof EditText) {
                    EditText editText = (EditText) view;
                    if (motionEvent.getX() >= ((float) (editText.getWidth() - editText.getTotalPaddingRight()))) {
                        if (motionEvent.getAction() != 1) {
                            return true;
                        }
                        ((m56) obj).invoke((EditText) obj2);
                        return true;
                    }
                }
                return false;
            case 1:
                p85 p85 = (p85) obj;
                SpannableString text = p85.getText();
                if (text == null) {
                    return false;
                }
                j33 j33 = ((eq3) obj2).b;
                Layout textLayout = p85.getTextLayout();
                j33.getClass();
                if (motionEvent.getAction() == 0) {
                    j33.d = new qz7((Object) new WeakReference(view), 12, (Object) textLayout);
                    j33.e = text;
                }
                return j33.l.onTouchEvent(motionEvent);
            case 2:
                bc7[] bc7Arr2 = MessageWriteWidget.F0;
                ((m56) obj).invoke(motionEvent);
                return ((GestureDetector) obj2).onTouchEvent(motionEvent);
            case 3:
                if (motionEvent.getAction() == 1) {
                    Chip chip = (Chip) obj;
                    Drawable chipIcon = chip.getChipIcon();
                    if (motionEvent.getX() <= chip.getChipStartPadding() + ((float) (chipIcon != null ? chipIcon.getIntrinsicWidth() : 0))) {
                        ((k56) obj2).invoke();
                        return true;
                    }
                }
                return false;
            default:
                s3e s3e = (s3e) obj2;
                y0d y0d = s3e.J0;
                w0d w0d = y0d instanceof w0d ? (w0d) y0d : null;
                if (motionEvent.getAction() == 0 && w0d != null && w0d.Y && (m56 = (m56) obj) != null) {
                    m56.invoke(s3e);
                }
                return false;
        }
    }

    public /* synthetic */ rf1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
