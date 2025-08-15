package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.appbar.MaterialToolbar;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: mtc  reason: default package */
public final class mtc extends ia5 {
    public static final /* synthetic */ bc7[] t0;
    public final k8g X = a(byb.date_picker_divider);
    public final k8g Y = a(byb.send_with_notification_checkbox);
    public final k8g Z = a(byb.send_button);
    public final k8g c = a(byb.toolbar);
    public final k8g o = a(byb.date_time_picker);
    public final k8g s0 = a(byb.set_correct_time);

    static {
        Class<mtc> cls = mtc.class;
        hob hob = new hob(cls, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0);
        oec oec = nec.a;
        t0 = new bc7[]{hob, zr6.e(oec, cls, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), zr6.f(cls, "datePickerDivider", "getDatePickerDivider()Landroid/view/View;", 0, oec), zr6.f(cls, "notificationCheckbox", "getNotificationCheckbox()Landroidx/appcompat/widget/AppCompatCheckBox;", 0, oec), zr6.f(cls, "sendButton", "getSendButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0, oec), zr6.f(cls, "setCorrectTimeTextView", "getSetCorrectTimeTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0, oec)};
    }

    public final DateTimePicker b() {
        return (DateTimePicker) this.o.T0(this, t0[1]);
    }

    public final LongRoundedTitleSubtitleButton c() {
        return (LongRoundedTitleSubtitleButton) this.Z.T0(this, t0[4]);
    }

    public final void z(sme sme) {
        bc7[] bc7Arr = t0;
        ((View) this.X.T0(this, bc7Arr[2])).setBackgroundColor(sme.K);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.c.T0(this, bc7Arr[0]);
        int i = sme.w;
        materialToolbar.setTitleTextColor(i);
        materialToolbar.setNavigationIconTint(i);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.Y.T0(this, bc7Arr[3]);
        int i2 = sme.k;
        appCompatCheckBox.setHighlightColor(i2);
        appCompatCheckBox.setButtonTintList(ColorStateList.valueOf(i2));
        appCompatCheckBox.setTextColor(i);
        ngg.f(sme, c(), tu0.G(((float) 42) * fk4.d().getDisplayMetrics().density));
        ((AppCompatTextView) this.s0.T0(this, bc7Arr[5])).setTextColor(sme.y);
    }
}
