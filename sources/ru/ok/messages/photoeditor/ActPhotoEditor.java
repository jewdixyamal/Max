package ru.ok.messages.photoeditor;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

public class ActPhotoEditor extends q5 implements yva, qg3 {
    public static final /* synthetic */ int Z0 = 0;
    public zva U0;
    public cl8 V0;
    public boolean W0;
    public gaa X0;
    public final khe Y0 = new khe(new x5(1, this));

    public final void R(Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("photo_editor:cancel_dialog")) {
            zva zva = this.U0;
            qv4 qv4 = zva.b;
            uv4 uv4 = qv4.a;
            List<nv4> layers = uv4.getLayers();
            for (int size = layers.size() - 1; size >= 0; size--) {
                nv4 nv4 = layers.get(size);
                if (!(nv4 instanceof te0)) {
                    uv4.a.remove(nv4);
                    uv4.invalidate();
                }
            }
            qv4.b();
            cwa cwa = zva.e;
            cwa.getClass();
            cwa cwa2 = new cwa(false, false, false, cwa.o, cwa.X, true, cwa.Z);
            zva.e = cwa2;
            zva.a.a(cwa2);
            return;
        }
        setResult(0);
        finish();
    }

    public final String Z() {
        return "EDIT_IMAGE";
    }

    public final void j0() {
        if (!this.U0.b.h) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("photo_editor:cancel_dialog", true);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.m2);
        bundle2.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.l2);
        bundle2.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
        bundle2.putBundle("oneme:share:data", bundle);
        ConfirmationDialog confirmationDialog = new ConfirmationDialog();
        confirmationDialog.X0(bundle2);
        confirmationDialog.k1(S(), "ru.ok.messages.views.dialogs.ConfirmationDialog");
    }

    public final void k0(ng4 ng4) {
        int i;
        ov4 a = this.U0.b.a();
        if (a.a.isEmpty()) {
            a = null;
        }
        boolean z = true;
        boolean z2 = a != null && a.o;
        zva zva = this.U0;
        if (!this.W0 || z2) {
            z = false;
        }
        qv4 qv4 = zva.b;
        Rect bounds = qv4.a.getBounds();
        int i2 = 2000;
        if (bounds.width() > bounds.height()) {
            i = (int) ((((float) bounds.height()) / ((float) bounds.width())) * ((float) 2000));
        } else {
            i2 = (int) ((((float) bounds.width()) / ((float) bounds.height())) * ((float) 2000));
            i = 2000;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        uv4 uv4 = qv4.a;
        Rect resultBounds = uv4.getResultBounds();
        Canvas canvas = new Canvas(createBitmap);
        for (nv4 next : uv4.getLayers()) {
            if (next instanceof te0) {
                if (z) {
                    te0 te0 = (te0) next;
                    te0.getClass();
                    int width = canvas.getWidth();
                    int height = canvas.getHeight();
                    Drawable drawable = te0.a;
                    drawable.setBounds(0, 0, width, height);
                    drawable.draw(canvas);
                }
                canvas.scale(((float) i2) / ((float) resultBounds.width()), ((float) i) / ((float) resultBounds.height()));
                canvas.translate((float) (-resultBounds.left), (float) (-resultBounds.top));
            } else {
                next.draw(canvas);
            }
        }
        if (z2) {
            z7d z7d = ((y8a) ((ed3) this.K0.b)).n().b;
            z7d.getClass();
            createBitmap = j47.e0((int) z7d.q(PmsKey.f85minstickersize, (long) 432), (int) z7d.q(PmsKey.f75maxstickersize, (long) 512), createBitmap);
        }
        Intent intent = new Intent();
        File q = ((y8a) ((ed3) this.K0.b)).h().q(UUID.randomUUID().toString() + ".png");
        try {
            j47.h0(q.getPath(), createBitmap, 100, Bitmap.CompressFormat.PNG);
            intent.putExtra("photo_editor:result_uri", Uri.fromFile(q));
            intent.putExtra("photo_editor:editor_state", a);
            intent.putExtra("photo_editor:delayed_attrs", ng4);
            setResult(-1, intent);
            finish();
        } catch (Exception unused) {
            int i3 = jpc.E;
            Handler handler = a14.i;
            a14.N(0, this, getString(i3));
            setResult(0);
            finish();
        }
    }

    public final void onBackPressed() {
        if (!this.U0.b.h) {
            super.onBackPressed();
        } else {
            j0();
        }
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Object, pkg] */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.lang.Object, jc6] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, pkg] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, pkg] */
    public final void onCreate(Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        super.onCreate(bundle);
        f0(this.V0.L);
        setContentView(yyb.act_photo_editor);
        this.W0 = getIntent().getBooleanExtra("photo_editor:is_drawing", false);
        sme c = ((tme) ((y8a) ((ed3) this.K0.b)).getAccessor().c(tme.class)).c();
        uv4 editorSurfaceView = ((EditorSurfaceViewContainer) findViewById(xxb.act_photo_editor__editor)).getEditorSurfaceView();
        if (!this.W0) {
            editorSurfaceView.setBackgroundColor(this.V0.m);
        } else if (c.c) {
            editorSurfaceView.setBackgroundColor(c.m);
        } else {
            editorSurfaceView.setBackgroundColor(-1);
        }
        ewa ewa = new ewa(findViewById(xxb.act_photo_editor__root), ((y8a) ((ed3) this.K0.b)).n().c);
        Uri uri = (Uri) getIntent().getParcelableExtra("photo_editor:background_uri");
        if (uri != null) {
            ? obj2 = new Object();
            obj2.a = uri;
            obj2.c = null;
            obj2.b = 0;
            obj = obj2;
        } else {
            ? obj3 = new Object();
            obj3.b = -1;
            obj3.a = null;
            obj3.c = null;
            obj = obj3;
        }
        int i = c.c ? gpc.d : gpc.e;
        Resources resources = getResources();
        ThreadLocal threadLocal = vic.a;
        Drawable a = qic.a(resources, i, (Resources.Theme) null);
        if (a != null) {
            ? obj4 = new Object();
            obj4.c = a;
            obj4.a = null;
            obj4.b = 0;
            Resources resources2 = getResources();
            hle q = ((y8a) ((ed3) this.K0.b)).q();
            ? obj5 = new Object();
            obj5.a = resources2;
            obj5.b = q;
            obj5.c = obj;
            obj5.o = obj4;
            ov4 ov4 = getIntent().hasExtra("photo_editor:editor_state") ? (ov4) getIntent().getParcelableExtra("photo_editor:editor_state") : null;
            boolean booleanExtra = getIntent().getBooleanExtra("photo_editor:start_from_draw_sticker", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("photo_editor:draw_sticker_enabled", false);
            qv4 qv4 = new qv4(editorSurfaceView);
            khe khe = this.Y0;
            this.U0 = new zva(ewa, qv4, this, obj5, ov4, booleanExtra2, booleanExtra, ((Boolean) khe.getValue()).booleanValue());
            int i2 = ewa.x0[6];
            jp jpVar = ewa.c;
            ewa.c(jpVar.g.getInt("app.editor.color", i2));
            ewa.b.getContext();
            int i3 = jpVar.g.getInt("app.editor.width", bk4.a(8.0f));
            if (i3 > 0) {
                float f = (float) i3;
                ewa.t0.setBrushWidth(f);
                Iterator it = ewa.a.iterator();
                while (it.hasNext()) {
                    ((zva) it.next()).b.g = f;
                }
                jpVar.k((int) f, "app.editor.width");
            }
            if (bundle2 != null) {
                zva zva = this.U0;
                zva.getClass();
                if (bundle2.containsKey("ru.ok.tamtam.extra.EDITOR_STATE")) {
                    zva.d.f(zva.b, (ov4) bundle2.getParcelable("ru.ok.tamtam.extra.EDITOR_STATE"), true);
                }
                if (bundle2.containsKey("ru.ok.tamtam.extra.EDITOR_VIEW_STATE")) {
                    cwa cwa = (cwa) bundle2.getParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE");
                    zva.e = cwa;
                    zva.a.a(cwa);
                }
            }
            if (!((Boolean) khe.getValue()).booleanValue()) {
                ScheduledSendPickerDialogFragment.p1("ru.ok.messages.photoeditor.ActPhotoEditor", S(), this, new v5(1, this));
                return;
            }
            return;
        }
        throw new IllegalStateException("backgroundDrawable cannot be null");
    }

    public final void onDestroy() {
        super.onDestroy();
        cqc.b((iq1) this.U0.d.X);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zva zva = this.U0;
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_STATE", zva.b.a());
        bundle.putParcelable("ru.ok.tamtam.extra.EDITOR_VIEW_STATE", zva.e);
    }

    public final sme u() {
        if (this.V0 == null) {
            this.V0 = cl8.e0;
        }
        return this.V0;
    }
}
