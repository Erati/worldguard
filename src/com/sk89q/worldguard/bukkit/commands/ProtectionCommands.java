// $Id$
/*
 * WorldGuard
 * Copyright (C) 2010 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.sk89q.worldguard.bukkit.commands;

import org.bukkit.command.CommandSender;
import com.sk89q.minecraft.util.commands.*;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;

public class ProtectionCommands {
    @Command(aliases = {"region"},
            desc = "Region management commands")
    @NestedCommand({RegionCommands.class, RegionMemberCommands.class})
    public static void region(CommandContext args, WorldGuardPlugin plugin,
            CommandSender sender) throws CommandException {
    }
}