/*
 * Copyright (C) 2017 Argha Das
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package coolsd.lab.Commands;

import java.io.*;
import java.util.*;

/**
 *
 * @author Argha Das
 */
public class RuntimeExample {

    private final String commandCode = "cmd /c";
    private final Scanner scanner = new Scanner(System.in);
    private Process process;
    private BufferedReader reader;
    private String input = "";
    private final String defaultCode = "help";

    public RuntimeExample() {
        UserInput();
    }

    private void UserInput() {
        System.out.println("Enter command (ex: ipconfig)");
        input = scanner.nextLine();
        if (input.isEmpty()) {
            System.out.println("You didn't give any command please take a look at these available Commands." + "\n");
            sendCommand(defaultCode);
        } else {
            sendCommand(input);
        }
    }

    private void sendCommand(String command) {
        try {
            process = Runtime.getRuntime().exec(commandCode + " " + command);
            reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                showResult(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void showResult(String result) {
        System.out.println(result + "\n");
    }

    public static void main(String[] args) {
        new RuntimeExample();
    }

}
