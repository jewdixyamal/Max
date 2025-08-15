package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: r1b  reason: default package */
public final class r1b extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1b(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                r1b r1b = new r1b(3, (Continuation) obj3, 0);
                r1b.Y = (gg1) obj;
                r1b.Z = (pqa) obj2;
                return r1b.o(e5f.a);
            case 1:
                fka fka = (fka) obj2;
                r1b r1b2 = new r1b((Object) (g6b) this.Z, (Continuation) obj3, 1);
                r1b2.Y = (ImageView) obj;
                e5f e5f = e5f.a;
                r1b2.o(e5f);
                return e5f;
            case 2:
                fka fka2 = (fka) obj2;
                r1b r1b3 = new r1b((Object) (g6b) this.Z, (Continuation) obj3, 2);
                r1b3.Y = (AppCompatTextView) obj;
                e5f e5f2 = e5f.a;
                r1b3.o(e5f2);
                return e5f2;
            case 3:
                fka fka3 = (fka) obj2;
                r1b r1b4 = new r1b((Object) (Context) this.Z, (Continuation) obj3, 3);
                r1b4.Y = (h6b) obj;
                e5f e5f3 = e5f.a;
                r1b4.o(e5f3);
                return e5f3;
            case 4:
                fka fka4 = (fka) obj2;
                r1b r1b5 = new r1b((Object) (u6c) this.Z, (Continuation) obj3, 4);
                r1b5.Y = (RecyclerView) obj;
                e5f e5f4 = e5f.a;
                r1b5.o(e5f4);
                return e5f4;
            case 5:
                r1b r1b6 = new r1b(3, (Continuation) obj3, 5);
                r1b6.Y = (z8c) obj;
                r1b6.Z = (fka) obj2;
                e5f e5f5 = e5f.a;
                r1b6.o(e5f5);
                return e5f5;
            case 6:
                fka fka5 = (fka) obj2;
                r1b r1b7 = new r1b((Object) (RecordControlsWidget) this.Z, (Continuation) obj3, 6);
                r1b7.Y = (ImageView) obj;
                e5f e5f6 = e5f.a;
                r1b7.o(e5f6);
                return e5f6;
            case 7:
                fka fka6 = (fka) obj2;
                r1b r1b8 = new r1b((Object) (RecordControlsWidget) this.Z, (Continuation) obj3, 7);
                r1b8.Y = (TextView) obj;
                e5f e5f7 = e5f.a;
                r1b8.o(e5f7);
                return e5f7;
            case 8:
                View view = (View) obj;
                r1b r1b9 = new r1b((Object) (RecordControlsWidget) this.Z, (Continuation) obj3, 8);
                r1b9.Y = (fka) obj2;
                e5f e5f8 = e5f.a;
                r1b9.o(e5f8);
                return e5f8;
            case 9:
                fka fka7 = (fka) obj2;
                r1b r1b10 = new r1b((Object) (View) this.Z, (Continuation) obj3, 9);
                r1b10.Y = (View) obj;
                e5f e5f9 = e5f.a;
                r1b10.o(e5f9);
                return e5f9;
            case 10:
                fka fka8 = (fka) obj2;
                r1b r1b11 = new r1b((Object) (SearchMessageBottomWidget) this.Z, (Continuation) obj3, 10);
                r1b11.Y = (ConstraintLayout) obj;
                e5f e5f10 = e5f.a;
                r1b11.o(e5f10);
                return e5f10;
            case 11:
                r1b r1b12 = new r1b(3, (Continuation) obj3, 11);
                r1b12.Y = (List) obj;
                r1b12.Z = (b86) obj2;
                return r1b12.o(e5f.a);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                r1b r1b13 = new r1b(3, (Continuation) obj3, 12);
                r1b13.Y = (g4d) obj;
                r1b13.Z = (fka) obj2;
                e5f e5f11 = e5f.a;
                r1b13.o(e5f11);
                return e5f11;
            case 13:
                fka fka9 = (fka) obj2;
                r1b r1b14 = new r1b((Object) (d4d) this.Z, (Continuation) obj3, 13);
                r1b14.Y = (ConstraintLayout) obj;
                e5f e5f12 = e5f.a;
                r1b14.o(e5f12);
                return e5f12;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                LinearLayout linearLayout = (LinearLayout) obj;
                r1b r1b15 = new r1b((Object) (tmd) this.Z, (Continuation) obj3, 14);
                r1b15.Y = (fka) obj2;
                e5f e5f13 = e5f.a;
                r1b15.o(e5f13);
                return e5f13;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                r1b r1b16 = new r1b(3, (Continuation) obj3, 15);
                r1b16.Y = (AppCompatImageView) obj;
                r1b16.Z = (fka) obj2;
                e5f e5f14 = e5f.a;
                r1b16.o(e5f14);
                return e5f14;
            case 16:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) obj;
                fka fka10 = (fka) obj2;
                r1b r1b17 = new r1b((h4e) this.Y, (Context) this.Z, (Continuation) obj3);
                e5f e5f15 = e5f.a;
                r1b17.o(e5f15);
                return e5f15;
            case LangUtils.HASH_SEED /*17*/:
                View view2 = (View) obj;
                r1b r1b18 = new r1b((Object) (SuggestionsWidget) this.Z, (Continuation) obj3, 17);
                r1b18.Y = (fka) obj2;
                e5f e5f16 = e5f.a;
                r1b18.o(e5f16);
                return e5f16;
            case 18:
                fka fka11 = (fka) obj2;
                r1b r1b19 = new r1b((Object) (View) this.Z, (Continuation) obj3, 18);
                r1b19.Y = (ImageView) obj;
                e5f e5f17 = e5f.a;
                r1b19.o(e5f17);
                return e5f17;
            case 19:
                on5 on5 = (on5) obj;
                r1b r1b20 = new r1b((Object) (UploadFileAttachWorker) this.Z, (Continuation) obj3, 19);
                r1b20.Y = (Throwable) obj2;
                e5f e5f18 = e5f.a;
                r1b20.o(e5f18);
                return e5f18;
            case 20:
                fka fka12 = (fka) obj2;
                r1b r1b21 = new r1b((Object) (VideoMessageWidget) this.Z, (Continuation) obj3, 20);
                r1b21.Y = (TextView) obj;
                e5f e5f19 = e5f.a;
                r1b21.o(e5f19);
                return e5f19;
            default:
                ImageView imageView = (ImageView) obj;
                r1b r1b22 = new r1b((Object) (lsf) this.Z, (Continuation) obj3, 21);
                r1b22.Y = (fka) obj2;
                e5f e5f20 = e5f.a;
                r1b22.o(e5f20);
                return e5f20;
        }
    }

    public final Object o(Object obj) {
        fqa fqa;
        int i;
        int i2;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                gg1 gg1 = (gg1) this.Y;
                pqa pqa = (pqa) this.Z;
                int size = pqa.c.size();
                Map map = pqa.c;
                fqa fqa2 = pqa.a;
                if (size > 1) {
                    if (gg1 == null && (gg1 = pqa.d) == null) {
                        gg1 = pqa.e;
                    }
                    fqa = (fqa) map.get(gg1);
                    if (fqa == null) {
                        return fqa2;
                    }
                } else {
                    fqa = (fqa) x53.h0(map.values());
                    if (fqa == null) {
                        return fqa2;
                    }
                    if (!fqa.a.l() && fqa2.a.a()) {
                        return fqa2;
                    }
                }
                return fqa;
            case 1:
                od2.a0(obj);
                ImageView imageView = (ImageView) this.Y;
                g6b g6b = (g6b) this.Z;
                Integer num = g6b.b;
                if (num != null) {
                    i = g6b.getCurrentTheme().c(num.intValue());
                } else {
                    i = g6b.getCurrentTheme().getIcon().f;
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return e5f.a;
            case 2:
                od2.a0(obj);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.Y;
                g6b g6b2 = (g6b) this.Z;
                Integer num2 = g6b2.b;
                if (num2 != null) {
                    i2 = g6b2.getCurrentTheme().c(num2.intValue());
                } else {
                    i2 = g6b2.getCurrentTheme().getText().e;
                }
                appCompatTextView.setTextColor(i2);
                return e5f.a;
            case 3:
                od2.a0(obj);
                h6b h6b = (h6b) this.Y;
                h6b.setBackground(new ColorDrawable(h6b.getCurrentTheme().b().g));
                qp4.d(qp4.u0.b((Context) this.Z), h6b);
                return e5f.a;
            case 4:
                od2.a0(obj);
                ((RecyclerView) this.Y).setBackground(hm9.c0(Integer.valueOf(qp4.u0.b(((u6c) this.Z).a).i().b().g), (Integer) null, (Integer) null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                return e5f.a;
            case 5:
                od2.a0(obj);
                ((z8c) this.Y).W1.setColor(((fka) this.Z).i().b.c);
                return e5f.a;
            case 6:
                od2.a0(obj);
                ImageView imageView2 = (ImageView) this.Y;
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.Z;
                pq9 pq9 = qp4.u0;
                pq9.j(imageView2).getIcon();
                ngg.G((Drawable) recordControlsWidget.H0.getValue(), -1);
                ngg.G(recordControlsWidget.B0(), pq9.j(imageView2).a().s().a.b.b);
                return e5f.a;
            case 7:
                od2.a0(obj);
                TextView textView = (TextView) this.Y;
                pq9 pq92 = qp4.u0;
                textView.setTextColor(pq92.j(textView).getText().g);
                bc7[] bc7Arr = RecordControlsWidget.b1;
                ngg.G((InsetDrawable) ((RecordControlsWidget) this.Z).I0.getValue(), pq92.j(textView).getIcon().j);
                return e5f.a;
            case 8:
                od2.a0(obj);
                bc7[] bc7Arr2 = RecordControlsWidget.b1;
                ((GradientDrawable) ((RecordControlsWidget) this.Z).L0.getValue()).setColor(((fka) this.Y).getText().b);
                return e5f.a;
            case 9:
                od2.a0(obj);
                View view = (View) this.Y;
                pq9 pq93 = qp4.u0;
                ((View) this.Z).setBackgroundColor(pq93.j(view).b().k);
                ((TextView) view.findViewById(kxb.oneme_settings_privacy_onboarding_content_title)).setTextColor(pq93.j(view).getText().e);
                return e5f.a;
            case 10:
                od2.a0(obj);
                bc7[] bc7Arr3 = SearchMessageBottomWidget.s0;
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.Z;
                ((ConstraintLayout) this.Y).setBackgroundColor(searchMessageBottomWidget.s0().a.d);
                searchMessageBottomWidget.n0().setTextColor(searchMessageBottomWidget.s0().d.g);
                searchMessageBottomWidget.o0().setBackgroundColor(searchMessageBottomWidget.s0().b.c);
                searchMessageBottomWidget.r0(searchMessageBottomWidget.p0(), searchMessageBottomWidget.Y);
                searchMessageBottomWidget.r0(searchMessageBottomWidget.m0(), searchMessageBottomWidget.Z);
                return e5f.a;
            case 11:
                od2.a0(obj);
                return new kpa((List) this.Y, (b86) this.Z);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                od2.a0(obj);
                ((g4d) this.Y).setBackgroundColor(((fka) this.Z).b().m);
                return e5f.a;
            case 13:
                od2.a0(obj);
                ConstraintLayout constraintLayout = (ConstraintLayout) this.Y;
                d4d d4d = (d4d) this.Z;
                ImageView imageView3 = d4d.F0;
                pq9 pq94 = qp4.u0;
                imageView3.setColorFilter(pq94.j(constraintLayout).getIcon().k);
                d4d.G0.setTextColor(pq94.j(constraintLayout).getText().e);
                d4d.H0.setTextColor(pq94.j(constraintLayout).getText().g);
                return e5f.a;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                od2.a0(obj);
                fka fka = (fka) this.Y;
                tmd tmd = (tmd) this.Z;
                tmd.M0.setBackgroundColor(fka.b().j);
                tmd.G0.setTextColor(fka.getText().e);
                AppCompatEditText appCompatEditText = tmd.H0;
                appCompatEditText.setTextColor(fka.getText().e);
                appCompatEditText.setHintTextColor(fka.getText().i);
                tmd.I0.setTextColor(fka.getText().j);
                tmd.O0.setTextColor(fka.getText().g);
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                od2.a0(obj);
                ((AppCompatImageView) this.Y).setImageTintList(ColorStateList.valueOf(((fka) this.Z).getIcon().j));
                return e5f.a;
            case 16:
                od2.a0(obj);
                h4e h4e = (h4e) this.Y;
                ngg.G(h4e.F0, qp4.u0.b((Context) this.Z).i().b().a.g);
                e02 e02 = h4e.L0;
                if (e02 != null) {
                    if (h4e.G0 != null) {
                        h4e.G0 = h4e.G();
                    }
                    w3e w3e = e02.b;
                    h4e.E(w3e.Y);
                    h4e.F(w3e.Z);
                }
                return e5f.a;
            case LangUtils.HASH_SEED /*17*/:
                od2.a0(obj);
                fka fka2 = (fka) this.Y;
                bc7[] bc7Arr4 = SuggestionsWidget.B0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.Z;
                suggestionsWidget.z0().setTextColor(fka2.getText().h);
                suggestionsWidget.y0().setBackgroundColor(fka2.getIcon().h);
                bc7[] bc7Arr5 = SuggestionsWidget.B0;
                bc7 bc7 = bc7Arr5[4];
                ((AppCompatImageView) suggestionsWidget.x0.getValue()).setImageTintList(ColorStateList.valueOf(fka2.getIcon().f));
                bc7 bc72 = bc7Arr5[5];
                ((AppCompatTextView) suggestionsWidget.y0.getValue()).setTextColor(fka2.getText().e);
                return e5f.a;
            case 18:
                od2.a0(obj);
                ImageView imageView4 = (ImageView) this.Y;
                pq9 pq95 = qp4.u0;
                View view2 = (View) this.Z;
                pq95.j(view2).getIcon();
                imageView4.setColorFilter(-1);
                imageView4.setBackgroundColor(pq95.j(view2).b().a.k);
                return e5f.a;
            case 19:
                od2.a0(obj);
                Throwable th = (Throwable) this.Y;
                if (th != null) {
                    UploadFileAttachWorker uploadFileAttachWorker = (UploadFileAttachWorker) this.Z;
                    uploadFileAttachWorker.e(th);
                    uploadFileAttachWorker.C0 = fm7.a();
                }
                return e5f.a;
            case 20:
                od2.a0(obj);
                TextView textView2 = (TextView) this.Y;
                pq9 pq96 = qp4.u0;
                pq96.j(textView2).getText();
                textView2.setTextColor(-1);
                ((GradientDrawable) textView2.getBackground()).setColor(pq96.j(textView2).b().a.h);
                bc7[] bc7Arr6 = VideoMessageWidget.y0;
                ngg.G((InsetDrawable) ((VideoMessageWidget) this.Z).s0.getValue(), pq96.j(textView2).f().a);
                return e5f.a;
            default:
                od2.a0(obj);
                lsf lsf = (lsf) this.Z;
                Drawable b = lsf.getPauseSmallIcon();
                ((fka) this.Y).getIcon();
                ngg.G(b, -1);
                ngg.G(lsf.getPlayIcon(), -1);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r1b(h4e h4e, Context context, Continuation continuation) {
        super(3, continuation);
        this.X = 16;
        this.Y = h4e;
        this.Z = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1b(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }
}
