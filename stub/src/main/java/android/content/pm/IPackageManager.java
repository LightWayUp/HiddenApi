package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import androidx.annotation.RequiresApi;

public interface IPackageManager extends IInterface {

    ApplicationInfo getApplicationInfo(String packageName, int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    ApplicationInfo getApplicationInfo(String packageName, long flags, int userId)
            throws RemoteException;

    PackageInfo getPackageInfo(String packageName, int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    PackageInfo getPackageInfo(String packageName, long flags, int userId)
            throws RemoteException;

    int getPackageUid(String packageName, int userId)
            throws RemoteException;

    @RequiresApi(24)
    int getPackageUid(String packageName, int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    int getPackageUid(String packageName, long flags, int userId)
            throws RemoteException;

    String[] getPackagesForUid(int uid)
            throws RemoteException;

    ParceledListSlice getInstalledPackages(int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    ParceledListSlice getInstalledPackages(long flags, int userId)
            throws RemoteException;

    ParceledListSlice getInstalledApplications(int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    ParceledListSlice getInstalledApplications(long flags, int userId)
            throws RemoteException;

    int getUidForSharedUser(String sharedUserName)
            throws RemoteException;

    void grantRuntimePermission(String packageName, String permissionName, int userId)
            throws RemoteException;

    void revokeRuntimePermission(String packageName, String permissionName, int userId)
            throws RemoteException;

    int getPermissionFlags(String permissionName, String packageName, int userId)
            throws RemoteException;

    void updatePermissionFlags(String permissionName, String packageName, int flagMask, int flagValues, int userId)
            throws RemoteException;

    @RequiresApi(29)
    void updatePermissionFlags(String permissionName, String packageName, int flagMask, int flagValues, boolean checkAdjustPolicyFlagPermission, int userId)
            throws RemoteException;

    int checkPermission(String permName, String pkgName, int userId)
            throws RemoteException;

    int checkUidPermission(String permName, int uid)
            throws RemoteException;

    boolean getApplicationHiddenSettingAsUser(String packageName, int userId)
            throws RemoteException;

    ProviderInfo resolveContentProvider(String name, int flags, int userId)
            throws RemoteException;

    @RequiresApi(33)
    ProviderInfo resolveContentProvider(String name, long flags, int userId)
            throws RemoteException;

    abstract class Stub extends Binder implements IPackageManager {

        public static IPackageManager asInterface(IBinder obj) {
            throw new UnsupportedOperationException();
        }
    }
}
