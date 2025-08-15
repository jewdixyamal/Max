package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: on  reason: default package */
public abstract class on {
    /* JADX INFO: finally extract failed */
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        sy4 sy4;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                sy4 = new sy4(clipData, 3);
            } else {
                zs3 zs3 = new zs3();
                zs3.b = clipData;
                zs3.c = 3;
                sy4 = zs3;
            }
            zmf.g(textView, sy4.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        sy4 sy4;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            sy4 = new sy4(clipData, 3);
        } else {
            zs3 zs3 = new zs3();
            zs3.b = clipData;
            zs3.c = 3;
            sy4 = zs3;
        }
        zmf.g(view, sy4.build());
        return true;
    }
}
