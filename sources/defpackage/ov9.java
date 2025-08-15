package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: ov9  reason: default package */
public final class ov9 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet o = new HashSet();

    public ov9(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(nv9 nv9) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = nv9.a;
        if (isLoggable) {
            Objects.toString(componentName);
            nv9.d.size();
        }
        if (!nv9.d.isEmpty()) {
            if (nv9.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                nv9.b = bindService;
                if (bindService) {
                    nv9.e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z = nv9.b;
            }
            if (!z || nv9.c == null) {
                b(nv9);
                return;
            }
            while (true) {
                arrayDeque = nv9.d;
                lv9 lv9 = (lv9) arrayDeque.peek();
                if (lv9 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        lv9.toString();
                    }
                    lv9.a(nv9.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(nv9);
            }
        }
    }

    public final void b(nv9 nv9) {
        Handler handler = this.b;
        ComponentName componentName = nv9.a;
        if (!handler.hasMessages(3, componentName)) {
            int i = nv9.e;
            int i2 = i + 1;
            nv9.e = i2;
            if (i2 > 6) {
                ArrayDeque arrayDeque = nv9.d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) ((1 << i) * 1000));
        }
    }

    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        if (i == 0) {
            lv9 lv9 = (lv9) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (pv9.c) {
                if (string != null) {
                    try {
                        if (!string.equals(pv9.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet2.add(unflattenFromString2.getPackageName());
                                }
                            }
                            pv9.e = hashSet2;
                            pv9.d = string;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                hashSet = pv9.e;
            }
            if (!hashSet.equals(this.o)) {
                this.o = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (hashSet.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new nv9(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        nv9 nv9 = (nv9) entry.getValue();
                        if (nv9.b) {
                            this.a.unbindService(this);
                            nv9.b = false;
                        }
                        nv9.c = null;
                        it2.remove();
                    }
                }
            }
            for (nv9 nv92 : this.c.values()) {
                nv92.d.add(lv9);
                a(nv92);
            }
            return true;
        } else if (i == 1) {
            mv9 mv9 = (mv9) message.obj;
            ComponentName componentName3 = mv9.a;
            IBinder iBinder = mv9.b;
            nv9 nv93 = (nv9) this.c.get(componentName3);
            if (nv93 != null) {
                nv93.c = INotificationSideChannel.Stub.asInterface(iBinder);
                nv93.e = 0;
                a(nv93);
            }
            return true;
        } else if (i == 2) {
            nv9 nv94 = (nv9) this.c.get((ComponentName) message.obj);
            if (nv94 != null) {
                if (nv94.b) {
                    this.a.unbindService(this);
                    nv94.b = false;
                }
                nv94.c = null;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            nv9 nv95 = (nv9) this.c.get((ComponentName) message.obj);
            if (nv95 != null) {
                a(nv95);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new mv9(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
