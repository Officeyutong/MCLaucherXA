/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ytbolg.mcxa;

/**
 *
 * @author Ytong
 */
public class LangFile {

    public static String Version = "2.5";
    public static String sChinese = "#这是MCLauncherXA的语言文件\n"
            + "#This is the language file of the MCLauncherXA\n"
            + "#请不要随意修改，可能会导致程序错误\n"
            + "#Don't change it,maybe the App will crash because of it\n"
            + "Lang=简体中文\n"
            + "#通用\n"
            + "DownFaild=下载失败！\n"
            + "#主窗口\n"
            + "#控件\n"
            + "Main_Title=MCLaucherXA 1.0 by officeyutong\n"
            + "Main_Label_Username=启动用户名\n"
            + "Main_CheckBox_zhangben=正版\n"
            + "Main_Label_Memory=启动内存\n"
            + "Main_Label_Type=版本类型\n"
            + "Main_Label_Time=发布时间\n"
            + "Main_Label_BMCLVAPI=注：本启动器使用了BMCLAPI！\n"
            + "Main_Label_Update=有新的版本！\n"
            + "Main_Button_Lauch=启动！\n"
            + "Main_Button_GetAss=获取资源文件\n"
            + "Main_Menu_File=文件\n"
            + "Main_Menu_DownVersion=游戏下载\n"
            + "Main_Menu_DownForge=Forge下载\n"
            + "Main_Menu_Config=设置\n"
            + "Main_Menu_About=关于\n"
            + "Main_Menu_Update=检查更新\n"
            + "Main_Menu_Help=帮助\n"
            + "Main_Menu_Delete=删除该版本\n"
            + "Main_Menu_Brush=刷新\n"
            + "Main_Menu_RedownloadLib=重新下载所有库文件\n"
            + "#窗口激活方法\n"
            + "Main_NotWindows=当前系统为非Windows，请不要把启动器放在windows文件系统下，否则无法启动！\n"
            + "#启动按钮方法\n"
            + "Main_NoselectVersion=我真佩服你的智商，你居然连个版本都没选！\n"
            + "Main_NoselectVersionTitle=鄙视\n"
            + "Main_NoUserName=你连用户名都不写还启动个毛线？\n"
            + "Main_NoMemory=你连内存都不写还启动个毛线？\n"
            + "Main_Error=错误\n"
            + "Main_LoginFaild=登录失败！\n"
            + "#main方法\n"
            + "Main_NoMinecraftDir=没有找到.minecraft目录！将会创建！\n"
            + "\n"
            + "#启动信息窗口\n"
            + "#窗口激活方法\n"
            + "Lauch_Title=启动中\n"
            + "Lauch_VersionToLauch=欲启动版本:\n"
            + "Lauch_UserName=用户名:\n"
            + "#下载线程\n"
            + "Lauch_LostLib1=发现有\n"
            + "Lauch_LostLib2=个丢失的库文件\n"
            + "Lauch_StratDownload=开始下载丢失的库文件\n"
            + "#解压线程\n"
            + "Lauch_StartUnzipNative=开始解压Native\n"
            + "Lauch_StartReplaceLauchArgs=开始替换启动参数\n"
            + "Lauch_ForStarting=准备启动\n"
            + "Lauch_StartUnzip=开始解压:\n"
            + "Lauch_UnzipSucc=成功解压:\n"
            + "Lauch_UnzipFaild1=解压\n"
            + "Lauch_UnzipFaild2=失败\n"
            + "\n"
            + "#设置窗口\n"
            + "#控件\n"
            + "Set_Title=设置\n"
            + "Set_CheckBox_Ifclose=是否在启动后关闭启动信息窗口\n"
            + "Set_CheckBox_ShowArgs=是否在启动信息窗口输出启动参数\n"
            + "Set_CheckBox_IsDulu=每个版本独立的文件夹\n"
            + "Set_Button_Cancel=取消\n"
            + "Set_Button_SaveAndClose=保存并关闭\n"
            + "Set_Label_Lang=选择语言:\n"
            + "Set_Label_LibUrl=下载源\n"
            + "Set_Label_Warning=注：语言更改将在重启后生效\n"
            + "Set_Label_Minecraft=游戏文件夹位置\n"
            + "Set_Label_Javapath=Java目录\n"
            + "\n"
            + "#下载库窗口\n"
            + "#控件\n"
            + "Lib_Title=注：本窗口不会自动关闭\n"
            + "Lib_Button_Cancel=取消\n"
            + "#下载线程\n"
            + "Lib_CountNotEquals=错误！本地文件数与远程文件数不相等\n"
            + "Lib_DownloadSucc=下载完成!\n"
            + "Lib_Download=下载\n"
            + "\n"
            + "#Forge下载窗口\n"
            + "#控件\n"
            + "Forge_Title=下载Forge\n"
            + "Forge_Window_Loading=加载中\n"
            + "Forge_Table_ForgeVer=Forge版本\n"
            + "Forge_Table_McVer=MC版本\n"
            + "Forge_Table_RelTime=发布时间\n"
            + "Forge_TabledPanel_OlderVersion=较旧版本\n"
            + "Forge_TabledPanel_NewerVersion=新版本\n"
            + "Forge_Button_Download=下载\n"
            + "#Forge下载线程\n"
            + "Forge_StartDown=开始下载\n"
            + "Forge_SetupForge=下载成功,下面将会运行forge安装程序，请在文件选择框里面输入游戏目录（已复制到剪切板）\n"
            + "\n"
            + "#版本下载窗口\n"
            + "#控件\n"
            + "Version_Title=版本下载\n"
            + "Version_Table_McVersion=版本\n"
            + "Version_Table_RelTime=发布时间\n"
            + "Version_Table_Type=版本类型\n"
            + "Version_Button_Download=下载\n"
            + "Version_TabledPanel_Zsb=正式版\n"
            + "Version_TabledPanel_Kzb=快照版\n"
            + "Version_TabledPanel_jbb=旧版本\n"
            + "Version_TabledPanel_qb=全部\n"
            + "#Version下载线程\n"
            + "Version_DownSucc=下载完成!"
            + "\n"
            + "#资源下载\n"
            + "Assets_Notsuppord=因为作者智商原因，本启动器目前只能下载1.7.2以上版本的资源文件，请见谅\n"
            + "Assets_NoFileDownloaded=，没有下载任何文件！"
            + "\n"
            + "#升级窗口\n"
            + "Up_Title=升级\n"
            + "Up_Label_newestVer=最新版本\n"
            + "Up_Label_nowVer=当前版本\n"
            + "Up_Label_newSm=升级说明\n"
            + "Up_Button_Download=下载\n"
            + "Up_Box_DownSucc=下载完成！新文件:\n"
            + "Up_DownFaild=下载失败！\n";

    public static String tChinese = "#這是MCLauncherXA的語言文件\n"
            + "#This is the language file of the MCLauncherXA\n"
            + "#請不要隨意修改，可能會導致程序錯誤\n"
            + "#Don't change it,maybe the App will crash because of it\n"
            + "Lang=繁體中文\n"
            + "#通用\n"
            + "DownFaild=下载失败！\n"
            + "#主窗口\n"
            + "#控件\n"
            + "Main_Title=MCLaucherXA 1.0 by officeyutong\n"
            + "Main_Label_Username=啓動用戶名\n"
            + "Main_CheckBox_zhangben=正版\n"
            + "Main_Label_Memory=啓動內存\n"
            + "Main_Label_Type=版本類型\n"
            + "Main_Label_Time=發布時間\n"
            + "Main_Label_BMCLVAPI=注：本啓動器使用了BMCLAPI！\n"
            + "Main_Label_Update=有新的版本！\n"
            + "Main_Button_Lauch=啓動！\n"
            + "Main_Button_GetAss=获取资源文件\n"
            + "Main_Menu_File=文件\n"
            + "Main_Menu_DownVersion=遊戲下載\n"
            + "Main_Menu_DownForge=Forge下載\n"
            + "Main_Menu_Config=設置\n"
            + "Main_Menu_Update=检查更新\n"
            + "Main_Menu_Help=幫助\n"
            + "Main_Menu_Delete=删除该版本\n"
            + "Main_Menu_Brush=刷新\n"
            + "Main_Menu_RedownloadLib=重新下载所有库文件\n"
            + "Main_Menu_About=关于\n"
            + "#窗口激活方法\n"
            + "Main_NotWindows=當前系統爲非Windows，請不要把啓動器放在windows文件系統下，否則無法啓動！\n"
            + "#啓動按鈕方法\n"
            + "Main_NoselectVersion=我真佩服你的智商，你居然連個版本都沒選！\n"
            + "Main_NoselectVersionTitle=鄙視\n"
            + "Main_NoUserName=你連用戶名都不寫還啓動個毛線？\n"
            + "Main_NoMemory=你連內存都不寫還啓動個毛線？\n"
            + "Main_Error=錯誤\n"
            + "Main_LoginFaild=登錄失敗！\n"
            + "#main方法\n"
            + "Main_NoMinecraftDir=沒有找到.minecraft目錄！將會創建！\n"
            + "\n"
            + "#啓動信息窗口\n"
            + "#窗口激活方法\n"
            + "Lauch_Title=啓動中\n"
            + "Lauch_VersionToLauch=欲啓動版本:\n"
            + "Lauch_UserName=用戶名:\n"
            + "#下載線程\n"
            + "Lauch_LostLib1=發現有\n"
            + "Lauch_LostLib2=個丟失的庫文件\n"
            + "Lauch_StratDownload=開始下載丟失的庫文件\n"
            + "#解壓線程\n"
            + "Lauch_StartUnzipNative=開始解壓Native\n"
            + "Lauch_StartReplaceLauchArgs=開始替換啓動參數\n"
            + "Lauch_ForStarting=准備啓動\n"
            + "Lauch_StartUnzip=開始解壓:\n"
            + "Lauch_UnzipSucc=成功解壓:\n"
            + "Lauch_UnzipFaild1=解壓\n"
            + "Lauch_UnzipFaild2=失敗\n"
            + "\n"
            + "#設置窗口\n"
            + "#控件\n"
            + "Set_Title=設置\n"
            + "Set_CheckBox_Ifclose=是否在啓動後關閉啓動信息窗口\n"
            + "Set_CheckBox_ShowArgs=是否在啓動信息窗口輸出啓動參數\n"
            + "Set_CheckBox_IsDulu=每个版本独立的文件夹\n"
            + "Set_Button_Cancel=取消\n"
            + "Set_Button_SaveAndClose=保存並關閉\n"
            + "Set_Label_Lang=選擇語言:\n"
            + "Set_Label_LibUrl=下载源\n"
            + "Set_Label_Warning=注：語言更改將在重啓後生效\n"
            + "Set_Label_Minecraft=游戏文件夹位置\n"
            + "Set_Label_Javapath=Java目录\n"
            + "\n"
            + "#下載庫窗口\n"
            + "#控件\n"
            + "Lib_Title=注：本窗口不會自動關閉\n"
            + "Lib_Button_Cancel=取消\n"
            + "#下載線程\n"
            + "Lib_CountNotEquals=錯誤！本地文件數與遠程文件數不相等\n"
            + "Lib_DownloadSucc=下載完成!\n"
            + "Lib_Download=下載\n"
            + "\n"
            + "#Forge下載窗口\n"
            + "#控件\n"
            + "Forge_Title=下載Forge\n"
            + "Forge_Window_Loading=加載中\n"
            + "Forge_Table_ForgeVer=Forge版本\n"
            + "Forge_Table_McVer=MC版本\n"
            + "Forge_Table_RelTime=發布時間\n"
            + "Forge_TabledPanel_OlderVersion=較舊版本\n"
            + "Forge_TabledPanel_NewerVersion=新版本\n"
            + "Forge_Button_Download=下載\n"
            + "#Forge下載線程\n"
            + "Forge_StartDown=開始下載\n"
            + "Forge_SetupForge=下載成功,下面將會運行forge安裝程序，請在文件選擇框裏面輸入遊戲目錄（已複制到剪切板）\n"
            + "\n"
            + "#版本下載窗口\n"
            + "#控件\n"
            + "Version_Title=版本下載\n"
            + "Version_Table_McVersion=版本\n"
            + "Version_Table_RelTime=發布時間\n"
            + "Version_Table_Type=版本類型\n"
            + "Version_Button_Download=下載\n"
            + "Version_TabledPanel_Zsb=正式版\n"
            + "Version_TabledPanel_Kzb=快照版\n"
            + "Version_TabledPanel_jbb=舊版本\n"
            + "Version_TabledPanel_qb=全部\n"
            + "#Version下載線程\n"
            + "Version_DownSucc=下載完成!"
            + "Assets_Notsuppord=因为作者智商原因，本启动器目前只能下载1.7.2以上版本的资源文件，请见谅\n"
            + "Assets_NoFileDownloaded=，没有下载任何文件！"
            + "\n"
            + "#升级窗口\n"
            + "Up_Title=升级\n"
            + "Up_Label_newestVer=最新版本\n"
            + "Up_Label_nowVer=当前版本\n"
            + "Up_Label_newSm=升级说明\n"
            + "Up_Button_Download=下载\n"
            + "Up_Box_DownSucc=下载完成！新文件:\n"
            + "Up_DownFaild=下载失败！\n";
    public static String english = "#这是MCLauncherXA的语言文件\n"
            + "#This is the language file of the MCLauncherXA\n"
            + "#请不要随意修改，可能会导致程序错误\n"
            + "#Don't change it,maybe the App will crash because of it\n"
            + "Lang=English\n"
            + "#通用\n"
            + "DownFaild=Downloaded Faild!\n"
            + "#主窗口\n"
            + "#控件\n"
            + "Main_Title=MCLaucherXA 1.0 by officeyutong\n"
            + "Main_Label_Username=Lauch Username\n"
            + "Main_CheckBox_zhangben=Genuine\n"
            + "Main_Label_Memory=StartMemory\n"
            + "Main_Label_Type=Version\n"
            + "Main_Label_Time=Release Time\n"
            + "Main_Label_BMCLVAPI=Note:This Launcher Used BMCLAPI！\n"
            + "Main_Label_Update=Update Available\n"
            + "Main_Button_Lauch=Start\n"
            + "Main_Button_GetAss=Get Ass\n"
            + "Main_Menu_File=File\n"
            + "Main_Menu_DownVersion=Game Download\n"
            + "Main_Menu_DownForge=Forge Download\n"
            + "Main_Menu_Config=Options\n"
            + "Main_Menu_Update=Check update\n"
            + "Main_Menu_Help=Help\n"
            + "Main_Menu_Delete=Delete the version\n"
            + "Main_Menu_Brush=Brush\n"
            + "Main_Menu_RedownloadLib=Redownload all the libraries\n"
            + "Main_Menu_About=About\n"
            + "#窗口激活方法\n"
            + "Main_NotWindows=The currentSystem was notWindows，Please not to put The Launcher in windows File System，Otherwise it is not going working!\n"
            + "#启动按钮方法\n"
            + "Main_NoselectVersion=I really admire your IQ, you even a version is not selected\n"
            + "Main_NoselectVersionTitle=Fuck\n"
            + "Main_NoUserName=Even your user name doesn't write also start a wool\n"
            + "Main_NoMemory=You even memory are not write also start a wool\n"
            + "Main_Error=Error\n"
            + "Main_LoginFaild=login Failed\n"
            + "#main方法\n"
            + "Main_NoMinecraftDir=.minecraft Catalog Not found！Will Establish\n"
            + "\n"
            + "#启动信息窗口\n"
            + "#窗口激活方法\n"
            + "Lauch_Title=启动中\n"
            + "Lauch_VersionToLauch=To start the version:\n"
            + "Lauch_UserName=UserName:\n"
            + "#下载线程\n"
            + "Lauch_LostLib1=Found\n"
            + "Lauch_LostLib2=The lost library file\n"
            + "Lauch_StratDownload=start the download missing library file\n"
            + "#解压线程\n"
            + "Lauch_StartUnzipNative=Start decompression  Native\n"
            + "Lauch_StartReplaceLauchArgs=Began to replace the boot parameters\n"
            + "Lauch_ForStarting=Ready to start\n"
            + "Lauch_StartUnzip=Start decompression\n"
            + "Lauch_UnzipSucc=Successful decompression:\n"
            + "Lauch_UnzipFaild1=decompression\n"
            + "Lauch_UnzipFaild2=Failed\n"
            + "\n"
            + "#设置窗口\n"
            + "#控件\n"
            + "Set_Title=Options\n"
            + "Set_CheckBox_Ifclose=Whether to close the start information window after start\n"
            + "Set_CheckBox_ShowArgs=Whether in the boot information window output boot parameters\n"
            + "Set_CheckBox_IsDulu=不会翻译。。。\n"
            + "Set_Button_Cancel=Cancel\n"
            + "Set_Button_SaveAndClose=Save and close\n"
            + "Set_Label_Lang=Choose the language:\n"
            + "Set_Label_LibUrl=Download from\n"
            + "Set_Label_Warning=Note：Language changes will take effect after restart\n"
            + "Set_Label_Minecraft=Game Path\n"
            + "Set_Label_Javapath=Java Path\n"
            + "\n"
            + "#下载库窗口\n"
            + "#控件\n"
            + "Lib_Title=Note：This window can not automatically close\n"
            + "Lib_Button_Cancel=Cancel\n"
            + "#下载线程\n"
            + "Lib_CountNotEquals=Error！Local files and remote file number is not equal to the number\n"
            + "Lib_DownloadSucc=The download is complete !\n"
            + "Lib_Download=Download\n"
            + "\n"
            + "#Forge下载窗口\n"
            + "#控件\n"
            + "Forge_Title=下载Forge\n"
            + "Forge_Window_Loading=Loading\n"
            + "Forge_Table_ForgeVer=ForgeVersion\n"
            + "Forge_Table_McVer=MCVersion\n"
            + "Forge_Table_RelTime=Release time\n"
            + "Forge_TabledPanel_OlderVersion=The older version\n"
            + "Forge_TabledPanel_NewerVersion=The new version\n"
            + "Forge_Button_Download=Download\n"
            + "#Forge下载线程\n"
            + "Forge_StartDown=To start the download\n"
            + "Forge_SetupForge=Downloaded successfully, the following will run the forge installation program，Please in the file selection box input the game directory（Has been copied to the clipboard)\n"
            + "\n"
            + "#版本下载窗口\n"
            + "#控件\n"
            + "Version_Title=Version download\n"
            + "Version_Table_McVersion=Minecraft version\n"
            + "Version_Table_RelTime=Release time\n"
            + "Version_Table_Type=Version Type\n"
            + "Version_Button_Download=Download\n"
            + "Version_TabledPanel_Zsb=All versions\n"
            + "Version_TabledPanel_Kzb=The snapshot versions\n"
            + "Version_TabledPanel_jbb=The older Versions\n"
            + "Version_TabledPanel_qb=All\n"
            + "#Version下载线程\n"
            + "Version_DownSucc=Download complete!"
            + "Assets_Notsuppord=Because of the trouble of the coder's IQ ,this laucher can't download the assets for the version before 1.7.2\n"
            + "Assets_NoFileDownloaded=without downloading anything"
            + "\n"
            + "#升级窗口\n"
            + "Up_Title=Update\n"
            + "Up_Label_newestVer=newest Version\n"
            + "Up_Label_nowVer=Now version\n"
            + "Up_Label_newSm=Update Message\n"
            + "Up_Button_Download=Download\n"
            + "Up_Box_DownSucc=Download successfully!New file:\n"
            + "Up_DownFaild=Download faild!\n";
}
