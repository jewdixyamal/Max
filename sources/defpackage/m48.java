package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* renamed from: m48  reason: default package */
public final /* synthetic */ class m48 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ m48(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final Object invoke() {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MediaBarPermissionWidget.Z;
                LinearLayout linearLayout = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setVerticalGravity(16);
                linearLayout.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                float f = (float) 4;
                layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                linearLayout.setLayoutParams(layoutParams);
                Drawable b2 = kt3.b(linearLayout.getContext(), s8a.e);
                AppCompatImageView appCompatImageView = new AppCompatImageView(linearLayout.getContext(), (AttributeSet) null);
                appCompatImageView.setImageDrawable(b2);
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), (AttributeSet) null);
                appCompatTextView.setText(u8a.M);
                appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                appCompatTextView.setPadding(appCompatTextView.getPaddingLeft(), tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
                i4f.D.b(appCompatTextView, du4.b);
                v3c.y(new c3(b2, appCompatTextView, (Continuation) null, 16), linearLayout);
                linearLayout.addView(appCompatImageView);
                linearLayout.addView(appCompatTextView);
                tu0.K(linearLayout, 300, new n48(mediaBarPermissionWidget, 0));
                return linearLayout;
            case 1:
                bc7[] bc7Arr2 = MediaBarPermissionWidget.Z;
                CameraxCameraApiView cameraxCameraApiView = new CameraxCameraApiView(mediaBarPermissionWidget.getContext(), (AttributeSet) null, 14);
                cameraxCameraApiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                cameraxCameraApiView.e();
                return cameraxCameraApiView;
            case 2:
                bc7[] bc7Arr3 = MediaBarPermissionWidget.Z;
                FrameLayout frameLayout = new FrameLayout(mediaBarPermissionWidget.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, tu0.G(((float) 138) * fk4.d().getDisplayMetrics().density));
                float f2 = (float) 12;
                layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                frameLayout.setLayoutParams(layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                frameLayout.setBackground(gradientDrawable);
                frameLayout.setClipToOutline(true);
                v3c.y(new o48(gradientDrawable, (Continuation) null, 0), frameLayout);
                i24.s(new zn5(((l48) mediaBarPermissionWidget.b.getValue()).c, new p48(mediaBarPermissionWidget, frameLayout, (Continuation) null), 5), mediaBarPermissionWidget.getViewLifecycleScope());
                return frameLayout;
            default:
                bc7[] bc7Arr4 = MediaBarPermissionWidget.Z;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarPermissionWidget.getContext());
                linearLayout2.setOrientation(1);
                linearLayout2.setVerticalGravity(16);
                linearLayout2.setHorizontalGravity(1);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, tu0.G(((float) 166) * fk4.d().getDisplayMetrics().density));
                float f3 = (float) 20;
                float f4 = (float) 0;
                layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
                linearLayout2.setLayoutParams(layoutParams3);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView2.setText(u8a.S);
                i4f.o.b(appCompatTextView2, du4.b);
                appCompatTextView2.setGravity(17);
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(linearLayout2.getContext(), (AttributeSet) null);
                appCompatTextView3.setText(u8a.R);
                i4f.s.b(appCompatTextView3, du4.b);
                appCompatTextView3.setPadding(appCompatTextView3.getPaddingLeft(), tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), appCompatTextView3.getPaddingRight(), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
                appCompatTextView3.setGravity(17);
                OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), (AttributeSet) null);
                oneMeButton.setText(u8a.L);
                oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                tu0.K(oneMeButton, 300, new n48(mediaBarPermissionWidget, 1));
                v3c.y(new c3(appCompatTextView2, appCompatTextView3, (Continuation) null, 17), linearLayout2);
                linearLayout2.addView(appCompatTextView2);
                linearLayout2.addView(appCompatTextView3);
                linearLayout2.addView(oneMeButton);
                return linearLayout2;
        }
    }
}
