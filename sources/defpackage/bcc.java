package defpackage;

import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: bcc  reason: default package */
public final /* synthetic */ class bcc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordExitBottomSheet b;

    public /* synthetic */ bcc(RecordExitBottomSheet recordExitBottomSheet, int i) {
        this.a = i;
        this.b = recordExitBottomSheet;
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [yz2, android.widget.TextView, android.widget.CompoundButton, android.view.View, java.lang.Object, androidx.appcompat.widget.AppCompatCheckBox] */
    public final Object invoke() {
        c7a c7a = c7a.c;
        pq9 pq9 = qp4.u0;
        RecordExitBottomSheet recordExitBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = RecordExitBottomSheet.G0;
                return a14.m(recordExitBottomSheet.getContext());
            case 1:
                bc7[] bc7Arr2 = RecordExitBottomSheet.G0;
                TextView textView = new TextView(recordExitBottomSheet.getContext());
                textView.setId(y7a.r1);
                i4f.c.b(textView, du4.b);
                textView.setTextColor(pq9.p(textView).c.getText().e);
                textView.setGravity(17);
                textView.setPadding(0, tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), 0, 0);
                return textView;
            case 2:
                bc7[] bc7Arr3 = RecordExitBottomSheet.G0;
                TextView textView2 = new TextView(recordExitBottomSheet.getContext());
                textView2.setId(y7a.q1);
                i4f.p.b(textView2, du4.b);
                textView2.setTextColor(pq9.p(textView2).c.getText().g);
                textView2.setGravity(17);
                return textView2;
            case 3:
                bc7[] bc7Arr4 = RecordExitBottomSheet.G0;
                OneMeButton oneMeButton = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton.setId(y7a.m1);
                oneMeButton.setAppearance(z6a.b);
                oneMeButton.setSize(c7a);
                oneMeButton.setCustomTheme(pq9.p(oneMeButton).c);
                return oneMeButton;
            case 4:
                bc7[] bc7Arr5 = RecordExitBottomSheet.G0;
                OneMeButton oneMeButton2 = new OneMeButton(recordExitBottomSheet.getContext(), (AttributeSet) null);
                oneMeButton2.setId(y7a.n1);
                oneMeButton2.setAppearance(z6a.c);
                oneMeButton2.setSize(c7a);
                oneMeButton2.setCustomTheme(pq9.p(oneMeButton2).c);
                return oneMeButton2;
            case 5:
                bc7[] bc7Arr6 = RecordExitBottomSheet.G0;
                ufd ufd = new ufd(recordExitBottomSheet.getContext(), (AttributeSet) null);
                ufd.setDisableStartIconText(true);
                int i = y7a.o1;
                ufd.setId(i);
                ufd.setItemId((long) i);
                int i2 = x7a.i0;
                x3 f = pq9.p(ufd).c.f();
                Drawable b2 = kt3.b(recordExitBottomSheet.getContext(), i2);
                if (b2 != null) {
                    aq4.g(b2, f.a);
                    aq4.i(b2, PorterDuff.Mode.SRC_IN);
                }
                ufd.setStartIcon(b2);
                ufd.setType(jfd.b);
                float[] fArr = new float[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    fArr[i3] = fk4.d().getDisplayMetrics().density * 16.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
                shapeDrawable.getPaint().setColor(pq9.p(ufd).c.b().a.g);
                ufd.setBackground(shapeDrawable);
                ufd.setThemeDepended(pfd.b);
                return ufd;
            default:
                bc7[] bc7Arr7 = RecordExitBottomSheet.G0;
                ? appCompatCheckBox = new AppCompatCheckBox(recordExitBottomSheet.getContext(), (AttributeSet) null);
                appCompatCheckBox.setId(y7a.p1);
                appCompatCheckBox.setText(b8a.w1);
                i4f.j.b(appCompatCheckBox, du4.b);
                appCompatCheckBox.setTextColor(pq9.p(appCompatCheckBox).c.getText().e);
                je7 je7 = recordExitBottomSheet.y0;
                a14.g((StateListDrawable) je7.getValue(), pq9.p(appCompatCheckBox).c);
                appCompatCheckBox.setButtonDrawable((Drawable) (StateListDrawable) je7.getValue());
                appCompatCheckBox.setChecked(false);
                appCompatCheckBox.setVisibility(8);
                appCompatCheckBox.setPaddingBetweenCheckbox(tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                return appCompatCheckBox;
        }
    }
}
